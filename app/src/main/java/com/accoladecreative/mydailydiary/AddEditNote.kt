package com.accoladecreative.mydailydiary

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.accoladecreative.mydailydiary.databinding.ActivityAddEditNoteBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AddEditNote : AppCompatActivity() {
    //data binding
    private lateinit var binding: ActivityAddEditNoteBinding;


    //ui
    lateinit var tv_diarynote:TextView
    lateinit var btn_submittext: Button
    lateinit var fab: FloatingActionButton

    lateinit var hiddenResult:LinearLayout;
    lateinit var tv_result_note: TextView
    lateinit var tv_delete_result:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_add_edit_note)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_add_edit_note)
        setTitle("Add New Note")

        initValues()
        saveNote()

        fab.setOnClickListener { view->
            startActivity(Intent(this,LoanCalculator::class.java))
        }


    }
    fun initValues(){
        /*tv_diarynote = findViewById(R.id.note)
        btn_submittext = findViewById<Button>(R.id.submit_note)
        fab =findViewById(R.id.goToLoanCalc)


        hiddenResult = findViewById(R.id.result_layout)
        tv_result_note = findViewById(R.id.result_note)
        tv_delete_result =findViewById(R.id.delete_result)
        */
        tv_diarynote = binding.note
        btn_submittext = binding.submitNote
        fab = binding.goToLoanCalc

        hiddenResult = binding.resultLayout
        tv_result_note = binding.resultNote
        tv_delete_result =binding.deleteResult


        binding.goToFrag.setOnClickListener { startActivity(Intent(this,FragmentsHolder::class.java)) }


    }
    fun saveNote(){
            btn_submittext.setOnClickListener { view ->
                hiddenResult.setVisibility(View.VISIBLE)
                tv_result_note.setText(tv_diarynote.text.toString())
                tv_delete_result.setOnClickListener {
                    tv_result_note.text =""

                }
                Toast.makeText(this, "This is the text you entered\n ${tv_diarynote.text.toString()}", Toast.LENGTH_LONG).show()
            }



    }


}