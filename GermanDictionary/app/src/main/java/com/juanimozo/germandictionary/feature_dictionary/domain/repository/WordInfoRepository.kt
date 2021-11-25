package com.juanimozo.germandictionary.feature_dictionary.domain.repository

import com.juanimozo.germandictionary.core.util.Resource
import com.juanimozo.germandictionary.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>

}