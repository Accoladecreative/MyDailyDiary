package com.accoladecreative.mydailydiary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.accoladecreative.mydailydiary.databinding.ActivityLoanCalculatorBinding

class LoanCalculator : AppCompatActivity() {
    //data bind
    private lateinit var binding:ActivityLoanCalculatorBinding;
    //ui
    lateinit var tv_loan_amount:TextView;
    lateinit var tv_loan_rate:TextView;
    lateinit var tv_loan_years:TextView;
    lateinit var btn_submit_loan:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_loan_calculator)//
        //      setContentView(R.layout.activity_loan_calculator)
        setTitle("Loan Calculator")
/*

        btn_submit_loan = findViewById(R.id.calculate_loan)
        tv_loan_amount = findViewById(R.id.loan_amount)
        tv_loan_rate = findViewById(R.id.loan_rate)
        tv_loan_years = findViewById(R.id.loan_years)
*/

        btn_submit_loan = binding.calculateLoan
        tv_loan_years = binding.loanYears
        tv_loan_rate = binding.loanRate
        tv_loan_amount = binding.loanAmount

            val rate = tv_loan_rate.text.toString().toInt()
            val loan = tv_loan_amount.text.toString().toInt()
            val years = tv_loan_years.text.toString().toInt()



        val result =calculateloan(loan,rate,years)
       // if (loan  && rate != null && years !=null) Toast.makeText(this,"The interest for the loan is out",Toast.LENGTH_LONG).show()
        btn_submit_loan.setOnClickListener { Toast.makeText(this,"The interest for the loan is $result",Toast.LENGTH_LONG).show() }
    }

    fun calculateloan(amount:Int, rate:Int,years:Int):Int{
        return amount*rate*years/100
    }





}