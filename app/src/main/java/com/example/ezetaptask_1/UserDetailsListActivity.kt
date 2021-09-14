package com.example.ezetaptask_1

import android.app.ActivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.ActivityCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ezetaptask_1.Adapter.UserDetailAdapter
import com.example.ezetaptask_1.data.UserEntity
import com.example.ezetaptask_1.databinding.ActivityUserDetailsListBinding
import kotlinx.android.synthetic.main.activity_user_details_list.*

class UserDetailsListActivity : AppCompatActivity() {

    lateinit var viewModel: UserViewModel
    lateinit var adapter2: UserDetailAdapter

    lateinit var binding : ActivityUserDetailsListBinding

    val listOfUser = mutableListOf<UserEntity>()




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
   binding = DataBindingUtil.setContentView(this,R.layout.activity_user_details_list)

        val UserRepository = (application as App).repository
        val viewModelFactory = UserViewModelFactory(UserRepository)
        viewModel = ViewModelProviders.of(this, viewModelFactory).get(UserViewModel::class.java)


        adapter2 = UserDetailAdapter(listOfUser, this)


        binding.rvRecycler.apply {

            this.layoutManager = LinearLayoutManager(context)
            this.adapter = adapter2

        }



        viewModel.getUser().observe(this, Observer {

            listOfUser.clear()

            listOfUser.addAll(it)

            adapter2.notifyDataSetChanged()


        })
    }
}