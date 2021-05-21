package com.accoladecreative.mydailydiary.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface EventDatabaseDio {

    @Insert
    fun insert_event(event: Event)

    @Update
    fun update_event(event: Event)

    //delete an event
    @Delete
    fun delete_event(event: Event)

    //delete all events
    @Query("DELETE FROM event_table")
    fun clear_diary()

    //get all events in a list view
    @Query("SELECT * FROM event_table ORDER BY id ASC")
    fun get_all_event(event: Event): LiveData<List<Event>>

    //select a particular events
    @Query("SELECT * FROM event_table WHERE  id =:_id")
    fun get_user(_id:Int):Event


    //select the last event
    @Query("SELECT * FROM event_table ORDER BY id DESC LIMIT 1" )
    fun get_latest_event():Event

}