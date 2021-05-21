package com.accoladecreative.mydailydiary.welcomeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.databinding.FragmentFailBinding
import com.accoladecreative.mydailydiary.databinding.FragmentQuizBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FailFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentFailBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_fail,container, false)

        binding.doAgainFailedButton.setOnClickListener {
          //  findNavController().navigate(R.id.action_failFragment_to_quizFragment)
            findNavController().navigate(FailFragmentDirections.actionFailFragmentToQuizFragment())
        }
        return binding.root


    }
}