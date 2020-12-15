package com.example.androidapp

import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class TimepickerActivity : AppCompatActivity() {
    private lateinit var btnLoad:Button
    private lateinit var tvTime:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timepicker)

        btnLoad = findViewById(R.id.btnLoad)
        tvTime = findViewById(R.id.tvTime)

        btnLoad.setOnClickListener {
            val c = Calendar.getInstance()
            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minute = c.get(Calendar.MINUTE)

            val timerpickerDialogue = TimePickerDialog(
                this,
                { timePicker,hour,minute->
                    tvTime.text="$hour:$minute"


                },hour,minute,true

            )
            timerpickerDialogue.show()

        }
    }
}