package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.*

class Simplecalculator : AppCompatActivity() {

    private lateinit var  etFirst : EditText
    private lateinit var  etSecond : EditText
    private lateinit var  btnCalculate : Button
    private lateinit var  tvResult : TextView
    private lateinit var rdoAdd : RadioButton
    private lateinit var rdoSub : RadioButton
    private lateinit var rdoMult : RadioButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simplecalculator)


        //Reference/binding
        etFirst  = findViewById(R.id.etFirst)
        etSecond  = findViewById(R.id.etSecond)
        btnCalculate  = findViewById(R.id.btnCalculate)
        tvResult  = findViewById(R.id.tvResult)
        rdoAdd = findViewById(R.id.rdoAdd)
        rdoSub = findViewById(R.id.rdoSub)
        rdoMult = findViewById(R.id.rdoMult)



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
        var result =0
        if (rdoAdd.isChecked) {
           result = first + second
        }
        else if (rdoSub.isChecked) {
            result = first - second
        }
        else if (rdoMult.isChecked) {
            result = first * second
        }
        else
        {
          error("Please select one")
        }

        tvResult.text = result.toString()
    }


}
