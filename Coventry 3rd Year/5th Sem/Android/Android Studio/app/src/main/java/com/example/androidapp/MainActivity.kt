package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var  etFirst : EditText
    private lateinit var  etSecond : EditText
    private lateinit var  btnCalculate : Button
    private lateinit var  tvResult : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //Reference/binding
        etFirst  = findViewById(R.id.etFirst)
        etSecond  = findViewById(R.id.etSecond)
         btnCalculate  = findViewById(R.id.btnCalculate)
        tvResult  = findViewById(R.id.tvResult)


        //Setting click listener on button
        btnCalculate.setOnClickListener {

            if (checkEmptyvalues()) {

                getvalues()
            }

        }

    }
    //validation
    private fun checkEmptyvalues():Boolean{
        var flag = true
        if (TextUtils.isEmpty(etFirst.text)){
            etFirst.error = "Please enter first number"
            etFirst.requestFocus()
            flag = false

        }
        else if (TextUtils.isEmpty(etSecond.text)){
            etSecond.error="Please enter second number"
            etSecond.requestFocus()
            flag = false
        }
        return flag
    }
    private fun getvalues(){
        val first = etFirst.text.toString().toInt()
        val second = etSecond.text.toString().toInt()
        add(first,second)
    }
    //Function with return type
   private fun add(first: Int, second: Int) {
        val result = first + second
        tvResult.text = result.toString()


    }
}