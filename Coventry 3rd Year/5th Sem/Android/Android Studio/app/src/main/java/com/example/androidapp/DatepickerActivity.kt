package com.example.androidapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class DatepickerActivity : AppCompatActivity() {
    private lateinit var btnLoad:Button
    private lateinit var tvDate:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datepicker)

        btnLoad=findViewById(R.id.btnLoad)
        tvDate=findViewById(R.id.tvDate)

        btnLoad.setOnClickListener {
            loadCalender()
        }
    }

    private fun loadCalender() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        val datepicker = DatePickerDialog(
            this,
            {
                    view, year, month, dayOfMonth ->
                tvDate.text ="Selected Date : $dayOfMonth/$month/$year (dd-mm-yy)"
            },
            year,month,day
        )
        datepicker.show()


    }

}