package com.example.ezetaptask_1

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.ezetaptask_1.Adapter.UserDetailAdapter
import com.example.ezetaptask_1.Reposiotry.UserRepository
import com.example.ezetaptask_1.data.UserDao
import com.example.ezetaptask_1.data.UserEntity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  lateinit var viewModel: UserViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCreateUser.setOnClickListener {
            val name = etName.text.toString()
            val Phone = etPhoneNumber.text.toString()
            val address = etAddress.text.toString()


            val UserRepository = (application as App).repository
            val viewModelFactory = UserViewModelFactory(UserRepository)
            viewModel = ViewModelProviders.of(this, viewModelFactory).get(UserViewModel::class.java)



            val userEntity = UserEntity(name, Phone, address)
            viewModel.saveUser(userEntity)
        }

        btnShowUserList.setOnClickListener {

            var intent = Intent(this,UserDetailsListActivity::class.java)
            startActivity(intent)
        }
    }
}