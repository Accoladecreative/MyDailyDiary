package com.accoladecreative.mydailydiary.welcomeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.databinding.FragmentMiddleBinding

class MiddleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_middle, container, false)

        val binding:FragmentMiddleBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_middle,container,false)

        binding.apply{
            secondButton.setOnClickListener {
               // findNavController().navigate(R.id.action_middleFragment_to_thirdFragment)
                findNavController().navigate(MiddleFragmentDirections.actionMiddleFragmentToThirdFragment())
            }
            secondButtonPrevious.setOnClickListener {
                findNavController().navigate(R.id.action_middleFragment_to_welcomeFragment)
            }
        }



        return binding.root

    }

}