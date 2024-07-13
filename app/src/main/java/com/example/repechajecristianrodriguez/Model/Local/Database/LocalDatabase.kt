package com.example.repechajecristianrodriguez.Model.Local.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.repechajecristianrodriguez.Model.Local.Dao.LocalDao
import com.example.repechajecristianrodriguez.Model.Local.Entities.LocalDetails
import com.example.repechajecristianrodriguez.Model.Local.Entities.LocalList

@Database(entities = [LocalList::class, LocalDetails::class], version = 1, exportSchema = false)
abstract class LocalDatabase: RoomDatabase() {

    abstract fun getElementDao(): LocalDao

    companion object {


        @Volatile
        private var INSTANCE: LocalDatabase? = null

        fun getdatabase(context: Context): LocalDatabase {

            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    LocalDatabase::class.java,
                    "Local_database"
                ).build()
                INSTANCE = instance

                return instance
            }
        }
    }


}