package com.accoladecreative.mydailydiary.ui

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.database.Event
import com.accoladecreative.mydailydiary.database.EventDatabaseDio
import com.accoladecreative.mydailydiary.databinding.ActivityAddEventBinding
import java.time.LocalDateTime

class AddEventActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAddEventBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_add_event)
        title ="create Events"

    }

}