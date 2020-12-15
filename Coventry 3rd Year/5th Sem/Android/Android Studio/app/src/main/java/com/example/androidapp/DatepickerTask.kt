package com.example.androidapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*

class DatepickerTask : AppCompatActivity() {

    private lateinit var etDoj : EditText
    private lateinit var etDob: EditText
    private lateinit var btnConvert: Button
    private lateinit var tvDoj: TextView
    private lateinit var tvDob: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datepicker_task)

        etDoj = findViewById(R.id.etDoj)
        etDob = findViewById(R.id.etDob)
        btnConvert=findViewById(R.id.btnConvert)
        tvDob = findViewById(R.id.tvDob)
        tvDoj = findViewById(R.id.tvDoj)

        etDob.setOnClickListener {
            loadDob()
        }

        etDob.setOnClickListener {
            loadDoj()
        }

        btnConvert.setOnClickListener {
            loadConvert()
        }

    }

    private fun loadDob(){

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datepicker = DatePickerDialog(
                this,
                {
                    view, year, month, dayOfMonth ->
                    etDob.setText("Selected Date : $dayOfMonth/$month/$year (dd-mm-yy)")
                },
                year,month,day
        )
        datepicker.show()

    }

     private fun loadDoj(){

        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datepicker = DatePickerDialog(
                this,
                {
                    view, year, month, dayOfMonth ->
                    etDoj.setText("Selected Date : $dayOfMonth/$month/$year (dd-mm-yy)")
                },
                year,month,day
        )
        datepicker.show()

    }

    private fun loadConvert(){

    }

}