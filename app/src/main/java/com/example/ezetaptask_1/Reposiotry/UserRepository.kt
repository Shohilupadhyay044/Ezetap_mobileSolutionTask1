package com.example.ezetaptask_1.Reposiotry

import androidx.lifecycle.LiveData
import com.example.ezetaptask_1.data.RoomDb
import com.example.ezetaptask_1.data.UserDao
import com.example.ezetaptask_1.data.UserEntity
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UserRepository(val userDao: UserDao) {

    fun saveUser(userEntity: UserEntity) {
        CoroutineScope(Dispatchers.IO).launch {
            userDao.SaveUser(userEntity)
        }
    }

        fun getUserDetails() : LiveData<List<UserEntity>>{
           return userDao.getUser()
        }
    }


