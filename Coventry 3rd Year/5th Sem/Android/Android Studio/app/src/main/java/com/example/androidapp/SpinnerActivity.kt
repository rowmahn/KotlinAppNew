package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import java.text.FieldPosition

class SpinnerActivity : AppCompatActivity() {

    private val languages = arrayOf(
        "Nepali","English","Hindi","Chinese"
    )

    private lateinit var spinner: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        spinner = findViewById(R.id.spinner)

        //Array Adapter
        val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,
                languages

        )

        //Setting the adapter to spinner's adapter

        spinner.adapter = adapter


        //On item selected listerner on spinner

        spinner.onItemSelectedListener=
                object  : AdapterView.OnItemSelectedListener{
                    override fun onNothingSelected(parent: AdapterView<*>?) {
                        TODO("Not yet implemented")
                    }

                    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {


                        val selectedItem = parent?.getItemAtPosition(position).toString()
                        Toast.makeText(this@SpinnerActivity,"Selected item : $selectedItem",Toast.LENGTH_SHORT).show()
                    }

                }

        }

    }
