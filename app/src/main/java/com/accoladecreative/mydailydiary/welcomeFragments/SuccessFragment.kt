package com.accoladecreative.mydailydiary.welcomeFragments

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import com.accoladecreative.mydailydiary.R
import com.accoladecreative.mydailydiary.databinding.FragmentFailBinding
import com.accoladecreative.mydailydiary.databinding.FragmentSuccessBinding

class SuccessFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSuccessBinding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_success, container, false)

        binding.doAgainSuccessButton.setOnClickListener {
            findNavController().navigate(R.id.action_successFragment_to_quizFragment)
        }
        binding.shareSuccessResult.setOnClickListener {
            var intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT,"Congratulate me,I have pass the Quiz")
                type = "text/plain"
            }
            startActivity(Intent.createChooser(intent,null))
        }
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu_main,menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.add_event -> {
                true
            } R.id.add_event -> {
                true
            } R.id.action_settings -> {
                true
            }
            else->super.onOptionsItemSelected(item)
        }
    }

}