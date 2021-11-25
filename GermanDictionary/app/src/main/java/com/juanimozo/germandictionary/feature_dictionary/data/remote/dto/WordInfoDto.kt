package com.juanimozo.germandictionary.feature_dictionary.data.remote.dto

import com.juanimozo.germandictionary.feature_dictionary.data.local.entity.WordInfoEntity

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val origin: String?,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val word: String
) {

    fun toWordInfoEntity(): WordInfoEntity {
        return WordInfoEntity(
            meanings = meanings.map { it.toMeaning() },
            phonetic = phonetic,
            word = word
        )
    }

}