package com.example.dictionary.feture_dictionary.data.remote.dto

import com.example.dictionary.feture_dictionary.data.local.entity.WordInfoEntity
import com.example.dictionary.feture_dictionary.domain.model.WordInfo

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String
) {
    fun toWordInfoEntity() = WordInfoEntity(
        meanings = meanings.map { it.toMeaning() },
        origin = origin,
        phonetic = phonetic,
        word = word
    )

}