package com.accoladecreative.mydailydiary.ui.eventDiary

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.room.ColumnInfo
import androidx.room.PrimaryKey
import com.accoladecreative.mydailydiary.database.Event
import kotlinx.coroutines.launch
import java.time.LocalDateTime

class EventsViewModel(private val respository:EventRepository) : ViewModel() {
    // TODO: Implement the ViewModel
 //launch new coroutine
  /*  suspend fun getEvent(id:Int,title:String, details:String,  date: LocalDateTime): Event {
        var id = respository.getEvent().id!!;
        var id = respository.getEvent().id!!;
        var id = respository.getEvent().id!!;
        var id = respository.getEvent().id!!;


    }
*/



    init {
        viewModelScope.launch {
            //getEvent()
        }
        }
}