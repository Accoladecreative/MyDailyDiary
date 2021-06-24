package com.accoladecreative.mydailydiary.ui.eventDiary

import androidx.lifecycle.MutableLiveData
import com.accoladecreative.mydailydiary.database.Event
import com.accoladecreative.mydailydiary.network.APIService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

@Suppress("UNREACHABLE_CODE")
class EventRepository {



    suspend fun getEvent(myResponse: Event): Event{
        APIService.getDetails().enqueue(object: Callback<Event> {
            override fun onResponse(call: Call<Event>, response: Response<Event>) {
                if(response.code() ==200){

                }
                
            }

            override fun onFailure(call: Call<Event>, t: Throwable) {
                TODO("Not yet implemented")
                //myResponse = t.message

            }
        })
        return myResponse




        //return APIService.getDetails();
    }
}