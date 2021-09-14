package com.example.ezetaptask_1.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Insert
    fun SaveUser(userEntity: UserEntity)

    @Query("select *  from  User_table")

    fun getUser() : LiveData<List<UserEntity>>

}