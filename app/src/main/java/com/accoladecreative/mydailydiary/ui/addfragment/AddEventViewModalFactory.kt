package com.accoladecreative.mydailydiary.ui.addfragment

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.accoladecreative.mydailydiary.database.EventDatabaseDio

class AddEventViewModalFactory(
    private val dao:EventDatabaseDio,
    private val application: Application): ViewModelProvider.Factory {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(AddEventViewModel::class.java)){
            return AddEventViewModel(dao,application)as T
        }
        TODO("Not yet implemented")
    }
}