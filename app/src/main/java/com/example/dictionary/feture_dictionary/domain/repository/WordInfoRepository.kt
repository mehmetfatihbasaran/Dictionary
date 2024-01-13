package com.example.dictionary.feture_dictionary.domain.repository

import com.example.dictionary.core.util.Resource
import com.example.dictionary.feture_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {

    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>

}