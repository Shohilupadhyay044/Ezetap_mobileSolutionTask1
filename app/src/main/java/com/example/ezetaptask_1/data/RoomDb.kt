package com.example.ezetaptask_1.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [UserEntity::class], version = 1)
abstract class RoomDb : RoomDatabase() {

    abstract fun getUserDao() : UserDao

    companion object {

        private var INSTANCE : RoomDb ? = null

        fun getDataBase(context: Context) : RoomDb{

            if(INSTANCE == null){

                val builder = Room.databaseBuilder(
                    context.applicationContext,
                    RoomDb::class.java,"User_db"
                )
                builder.fallbackToDestructiveMigration()
                INSTANCE = builder.build()

                return INSTANCE!!
            }else{
                return INSTANCE!!
            }

        }
    }

}