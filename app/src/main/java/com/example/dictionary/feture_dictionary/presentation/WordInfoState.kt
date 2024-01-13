package com.example.dictionary.feture_dictionary.presentation

import com.example.dictionary.feture_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)
