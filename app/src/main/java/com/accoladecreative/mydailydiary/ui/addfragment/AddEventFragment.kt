package com.accoladecreative.mydailydiary.ui.addfragment

import android.os.Build
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.database.Event
import com.accoladecreative.mydailydiary.databinding.AddEventFragmentBinding
import kotlinx.coroutines.Job
import kotlinx.coroutines.runBlocking
import java.time.LocalDateTime

class AddEventFragment : Fragment() {

    companion object {
        fun newInstance() =
            AddEventFragment()
    }

    private lateinit var binding:AddEventFragmentBinding
    private lateinit var et_event_title: TextView
    private lateinit var et_event_details: TextView
    private lateinit var btn_save_event: Button
    private lateinit var btn_clear_event: Button
    var event_details:String = ""
    var event_title:String = ""
    private lateinit var viewModel: AddEventViewModel

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?
    ): View? {
        val binding:AddEventFragmentBinding = DataBindingUtil.inflate(inflater,R.layout.add_event_fragment, container, false)


        initUi()
        clickListeners()
        /*val kol = Job()
        if(kol.isActive){
            val kkk = "eeeeeeeeeeeeee"
            event_details=kkk
            runBlocking {
                event_details=kkk
            }
        }
        kol.cancel()*/
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
       // viewModel = ViewModelProvider(this).get(AddEventViewModel::class.java)
        // TODO: Use the ViewModel
    }





    @RequiresApi(Build.VERSION_CODES.O)
    private fun clickListeners() {
        btn_clear_event.setOnClickListener { clearEvent() }
        btn_save_event.setOnClickListener {
            //var event = Event(event_title,event_details, LocalDateTime.now())

        }
    }

    private fun initUi() {
        et_event_details = binding.etEventDetails
        et_event_title = binding.etEventTitle
        btn_clear_event = binding.clearEventButton
        btn_save_event = binding.saveEventButton

        event_details = et_event_details.text.toString()

        event_title = et_event_title.text.toString()
    }


    private fun clearEvent(){
        event_title = ""
        event_details =""


    }
}