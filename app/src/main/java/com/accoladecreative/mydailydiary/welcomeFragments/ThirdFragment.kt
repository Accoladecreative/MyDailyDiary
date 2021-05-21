package com.accoladecreative.mydailydiary.welcomeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.databinding.FragmentThirdBinding

class ThirdFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment


        val binding:FragmentThirdBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_third,container,false)

        binding.apply {
            thirdButtonPrevious.setOnClickListener {
                findNavController().navigate(R.id.action_thirdFragment_to_middleFragment)
            }
            thirdButton.setOnClickListener {
                findNavController().navigate(R.id.action_thirdFragment_to_quizFragment)
            }
        }

        return binding.root
    }


}