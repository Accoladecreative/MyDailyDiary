package com.accoladecreative.mydailydiary.welcomeFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.databinding.FragmentQuizBinding

/**
 * A simple [Fragment] subclass.
 * Use the [QuizFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class QuizFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding: FragmentQuizBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_quiz, container, false)

        binding.submitQuiz.setOnClickListener {
            if (binding.quiz1.text.toString() == "Apple" && binding.quiz2.text.toString() == "Mango") {
               findNavController().navigate(QuizFragmentDirections.actionQuizFragmentToSuccessFragment())
               // findNavController().navigate(R.id.action_quizFragment_to_successFragment)
            } else {
                findNavController().navigate(QuizFragmentDirections.actionQuizFragmentToFailFragment())
               // findNavController().navigate(R.id.action_quizFragment_to_failFragment)
            }
        }
        return binding.root

    }
}