package com.accoladecreative.mydailydiary.welcomeFragments.QuizFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.databinding.FragmentQuizBinding
import com.accoladecreative.mydailydiary.welcomeFragments.QuizFragmentDirections

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
        val binding = FragmentQuizBinding.inflate(inflater)
        //val binding: FragmentQuizBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_quiz, container, false)

        binding.submitQuiz.setOnClickListener {
            if(quiz(binding.quiz1.text.toString(),binding.quiz2.text.toString()))
            findNavController().navigate(QuizFragmentDirections.actionQuizFragmentToSuccessFragment())else
            findNavController().navigate(QuizFragmentDirections.actionQuizFragmentToFailFragment())



           /* if (binding.quiz1.text.toString() == "Apple" && binding.quiz2.text.toString() == "Mango") {
               findNavController().navigate(QuizFragmentDirections.actionQuizFragmentToSuccessFragment())

            // findNavController().navigate(R.id.action_quizFragment_to_successFragment)
            } else {
                findNavController().navigate(QuizFragmentDirections.actionQuizFragmentToFailFragment())
               // findNavController().navigate(R.id.action_quizFragment_to_failFragment)
            } */
        }


        return binding.root

    }


    }
    fun quiz(q1:String, q2:String):Boolean{
        var quiz = q1 == "Apple" && q2== "Mango"
        return quiz

}