package com.example.ezetaptask_1.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ezetaptask_1.R
import com.example.ezetaptask_1.UserDetailsListActivity
import com.example.ezetaptask_1.data.UserEntity

class UserDetailAdapter(
    private val user_list: List<UserEntity>,
    userDetailsListActivity: UserDetailsListActivity
) : RecyclerView.Adapter<UserDetailAdapter.ClassViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClassViewHolder {
        val view =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.user_list, parent, false)
        return ClassViewHolder(view)
    }

    override fun onBindViewHolder(holder: ClassViewHolder, position: Int) {

        holder.mTvName.text = user_list[position].name
        holder.mTvPhone.text = user_list[position].phoneNo.toString()
        holder.mTvAdress.text = user_list[position].address

    }

    override fun getItemCount(): Int {
        return user_list.size
    }


    class ClassViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

        val mTvName: TextView =
            view.findViewById<TextView>(R.id.tvName)

        val mTvPhone: TextView =
            view.findViewById<TextView>(R.id.tvPhone_Number)

        val mTvAdress: TextView =
            view.findViewById<TextView>(R.id.tvAddress)
    }
    }


