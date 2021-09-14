package com.example.ezetaptask_1.Adapter

import android.hardware.usb.UsbDeviceConnection
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ezetaptask_1.UserDetailsListActivity
import com.example.ezetaptask_1.data.UserEntity
import com.example.ezetaptask_1.databinding.UserListBinding

class UserDetailAdapter(
    private val user_list: List<UserEntity>,
    userDetailsListActivity: UserDetailsListActivity
) : RecyclerView.Adapter<UserDetailAdapter.ClassViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassViewHolder {
        val binding = UserListBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ClassViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ClassViewHolder, position: Int) {

//        holder.mTvName.text = user_list[position].name
//        holder.mTvPhone.text = user_list[position].phoneNo.toString()
//        holder.mTvAdress.text = user_list[position].address

        holder.userListBinding.userDetails = this.user_list[position]


    }

    override fun getItemCount(): Int {
        return user_list.size
    }


  inner class ClassViewHolder(val userListBinding: UserListBinding) : RecyclerView.ViewHolder(userListBinding.root) {

//        val mTvName: TextView =
//            view.findViewById<TextView>(R.id.tvName)

//        val mTvPhone: TextView =
//            view.findViewById<TextView>(R.id.tvPhone_Number)
//
//        val mTvAdress: TextView =
//            view.findViewById<TextView>(R.id.tvAddress)
    }

}


