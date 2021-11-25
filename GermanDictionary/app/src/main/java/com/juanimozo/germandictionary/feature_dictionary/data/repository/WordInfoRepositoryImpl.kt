package com.juanimozo.germandictionary.feature_dictionary.data.repository

import com.juanimozo.germandictionary.core.util.Resource
import com.juanimozo.germandictionary.feature_dictionary.data.local.WordInfoDao
import com.juanimozo.germandictionary.feature_dictionary.data.remote.DictionaryApi
import com.juanimozo.germandictionary.feature_dictionary.domain.model.WordInfo
import com.juanimozo.germandictionary.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

class WordInfoRepositoryImpl(
    private val api: DictionaryApi,
    private val dao: WordInfoDao
): WordInfoRepository {

    override fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>> = flow {
        emit(Resource.Loading())

        val wordInfo = dao.getWordInfos(word).map { it.toWordInfo() }
        emit(Resource.Loading(data = wordInfo))

        try {
            val remoteWordInfo = api.getWordInfo(word)
            dao.deleteWordsInfos(remoteWordInfo.map { it.word })
            dao.insertWordInfos(remoteWordInfo.map { it.toWordInfoEntity() })
        } catch (e: HttpException) {
            emit(Resource.Error(
                message = "Something went wrong.",
                data = wordInfo
            ))
        } catch (e: IOException) {
            emit(Resource.Error(
                message = "Something went wrong while doing Http request.",
                data = wordInfo
            ))
        }

        val newWordsInfo = dao.getWordInfos(word).map { it.toWordInfo() }
        emit(Resource.Success(newWordsInfo))
    }
}