package com.example.ezetaptask_1.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "User_table")
data class UserEntity(
        @ColumnInfo(name = "name") var name : String,
        @ColumnInfo(name = "phoneNo") var phoneNo : String,
        @ColumnInfo(name = "Address") var address : String

) {

     @PrimaryKey(autoGenerate = true)
     @ColumnInfo(name ="id")var id : Int? = null


}