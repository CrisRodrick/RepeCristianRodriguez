package com.example.repechajecristianrodriguez.Model.Local.Dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.repechajecristianrodriguez.Model.Local.Entities.LocalDetails
import com.example.repechajecristianrodriguez.Model.Local.Entities.LocalList

@Dao
interface LocalDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllElements(elementList: List<LocalList>)

    @Query ("SELECT * FROM List_Elements ORDER BY Id ASC")
    fun getAllElements(): LiveData<List<LocalList>>

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertElementsDetails (elementDetails: LocalDetails)


    @Query ("SELECT * FROM Details_Elements WHERE id= :id")
    fun getElementsDetailById(id:Int): LiveData<LocalDetails>

}