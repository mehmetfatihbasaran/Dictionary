package com.example.dictionary.feture_dictionary.data.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.dictionary.feture_dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {

    @Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    suspend fun insertWordInfos(infos: List<WordInfoEntity>)

    @Query("DELETE FROM wordinfoentity WHERE word IN (:words)")
    suspend fun deleteWordInfos(words: List<String>)

    @Query("SELECT * FROM wordinfoentity WHERE word LIKE '%' || :word || '%' ")
    suspend fun getWordInfos(word: String): List<WordInfoEntity>

}