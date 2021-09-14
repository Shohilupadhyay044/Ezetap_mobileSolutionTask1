package com.example.ezetaptask_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ezetaptask_1.Adapter.UserDetailAdapter
import com.example.ezetaptask_1.data.UserEntity
import kotlinx.android.synthetic.main.activity_user_details_list.*

class UserDetailsListActivity : AppCompatActivity() {

    lateinit var viewModel: UserViewModel

    lateinit var adapter2: UserDetailAdapter

    val listOfUser = mutableListOf<UserEntity>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details_list)

        val UserRepository = (application as App).repository
        val viewModelFactory = UserViewModelFactory(UserRepository)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(UserViewModel::class.java)


        adapter2 = UserDetailAdapter(listOfUser, this)
        rvRecycler.layoutManager = LinearLayoutManager(this)
        rvRecycler.adapter = adapter2



        viewModel.getUser().observe(this, Observer {

            listOfUser.clear()

            listOfUser.addAll(it)

            adapter2.notifyDataSetChanged()


        })
    }
}