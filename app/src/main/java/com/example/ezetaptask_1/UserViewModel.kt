package com.example.ezetaptask_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.ezetaptask_1.Reposiotry.UserRepository
import com.example.ezetaptask_1.data.UserEntity

class UserViewModel(val userRepository: UserRepository) : ViewModel() {

    fun saveUser(userEntity: UserEntity){

        userRepository.saveUser(userEntity)
    }

    fun getUser() :LiveData<List<UserEntity>>{
       return userRepository.getUserDetails()
    }


}