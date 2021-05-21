package com.accoladecreative.mydailydiary.ui.eventDiary

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.databinding.EventsFragmentBinding

class EventsFragment : Fragment() {

    companion object {
        fun newInstance() = EventsFragment()
    }

    private lateinit var binding:EventsFragmentBinding
    private lateinit var viewModel: EventsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.events_fragment, container, false)

        fab()
        return binding.root
    }

    private fun fab() {
        binding.floatingActionButton.setOnClickListener {
            findNavController().navigate(R.id.action_eventsFragment_to_addEventFragment)
        }
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
       // viewModel = ViewModelProvider(this).get(EventsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}