package com.juanimozo.germandictionary.feature_dictionary.presentation

import com.juanimozo.germandictionary.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)