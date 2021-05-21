package com.accoladecreative.mydailydiary.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDateTime

@Entity(tableName = "event_table")
data class Event(
    @PrimaryKey(autoGenerate = true)
    val id:Int? = 0,
    @ColumnInfo(name = "event_topic")
    var title:String?,
    @ColumnInfo(name = "event_details")
    val details:String,
    @ColumnInfo(name = "event_date")
    val date: LocalDateTime
  //  @ColumnInfo(name = "event_image")
    //val image:Int?
){
    //constructor(title: String, details: String, date: LocalDateTime)
}