package com.accoladecreative.mydailydiary.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Event::class], version = 1)
abstract class EventDatabase: RoomDatabase(){
    abstract fun databaseDio():EventDatabaseDio;
    @Volatile
    private var instance: EventDatabase? = null


    @Synchronized
    open fun getInstance(context: Context): EventDatabase?{
        if (instance == null){
            instance = Room.databaseBuilder(context,EventDatabase::class.java,"event_table").build()
        }
        return instance
    }


}