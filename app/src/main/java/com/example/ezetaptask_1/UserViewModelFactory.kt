package com.example.ezetaptask_1

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ezetaptask_1.Reposiotry.UserRepository

class UserViewModelFactory(val userRepository: UserRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return UserViewModel(userRepository) as T

    }
}