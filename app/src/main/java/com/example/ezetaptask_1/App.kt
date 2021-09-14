package com.example.ezetaptask_1

import android.app.Application
import com.example.ezetaptask_1.Reposiotry.UserRepository
import com.example.ezetaptask_1.data.RoomDb

class App : Application() {

    val userDao by lazy{

        RoomDb.getDataBase(this).getUserDao()
    }

    val repository by lazy{
        UserRepository(userDao)
    }
}