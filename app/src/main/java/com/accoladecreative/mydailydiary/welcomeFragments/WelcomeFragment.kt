package com.accoladecreative.mydailydiary.welcomeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {
       override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? { //
//         val view = inflater.inflate(R.layout.fragment_welcome, container, false)
       val binding:FragmentWelcomeBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_welcome,container,false)
        binding.firstButton.setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_welcomeFragment_to_middleFragment)
        }
        return binding.root

/*
       view.findViewById<Button>(R.id.first_button) .setOnClickListener {view ->
            view.findNavController().navigate(R.id.action_welcomeFragment_to_middleFragment)
        }
        return view
*/
    }
}