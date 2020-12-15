package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Spinner

class AutoCompleteActivity : AppCompatActivity() {

    private var languages = arrayOf("Nepali","English1","Chinese","English2","Hindi")
    private lateinit var autoComplete: AutoCompleteTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auto_complete)

        autoComplete=findViewById(R.id.autoComplete)

        //For autocomplete textview
        val autocompleteAdapter = ArrayAdapter(
                this,android.R.layout.simple_dropdown_item_1line,languages
        )

        autoComplete.setAdapter(autocompleteAdapter)
        autoComplete.threshold=1
    }
}