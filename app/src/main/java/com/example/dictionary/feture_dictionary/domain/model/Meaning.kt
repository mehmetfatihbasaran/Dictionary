package com.example.dictionary.feture_dictionary.domain.model

import com.example.dictionary.feture_dictionary.data.remote.dto.DefinitionDto

data class Meaning(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String
)
