package com.example.dictionary.feture_dictionary.data.remote.dto

import com.example.dictionary.feture_dictionary.domain.model.Meaning

data class MeaningDto(
    val definitions: List<DefinitionDto>,
    val partOfSpeech: String
) {
    fun toMeaning() = Meaning(definitions, partOfSpeech)
}