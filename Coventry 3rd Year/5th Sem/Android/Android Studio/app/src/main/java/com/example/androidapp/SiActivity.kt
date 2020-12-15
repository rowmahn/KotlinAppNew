package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SiActivity : AppCompatActivity() {
    private lateinit var  etPrinciple : EditText
    private lateinit var  etTime : EditText
    private lateinit var  etRate : EditText
    private lateinit var  btnCalculate : Button
    private lateinit var  tvResult : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_si)

        //Reference/binding
        etPrinciple  = findViewById(R.id.etPrinciple)
        etTime  = findViewById(R.id.etTime)
        etRate = findViewById(R.id.etRate)
        btnCalculate  = findViewById(R.id.btnCalculate)
        tvResult  = findViewById(R.id.tvResult)

        //Setting click listener on button
        btnCalculate.setOnClickListener {

            if (checkEmptyvalues()) {

                getvalues()
            }
    }
}
    private fun checkEmptyvalues():Boolean{
        var flag = true
        if (TextUtils.isEmpty(etPrinciple.text)){
            etPrinciple.error = "Please enter Principle"
            etPrinciple.requestFocus()
            flag = false

        }
        else if (TextUtils.isEmpty(etTime.text)){
            etTime.error = "Please enter Time"
            etTime.requestFocus()
            flag = false

        }
       else if (TextUtils.isEmpty(etRate.text)){
            etRate.error = "Please Rate"
            etRate.requestFocus()
            flag = false

        }
        return flag
    }
    private fun getvalues(){
        val principal = etPrinciple.text.toString().toInt()
        val time = etTime.text.toString().toInt()
        val rate = etRate.text.toString().toInt()
        add(principal,time,rate)
    }
    //Function with return type
    private fun add(principal: Int, time: Int, rate: Int) {
        val result = (principal*time*rate)/100
        tvResult.text = result.toString()


    }
}