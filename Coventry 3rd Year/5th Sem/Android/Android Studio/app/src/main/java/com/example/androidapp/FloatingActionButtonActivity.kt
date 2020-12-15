package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FloatingActionButtonActivity : AppCompatActivity() {

    private lateinit var btnFab:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_floating_action_button)

        btnFab.setOnClickListener {
            Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()

        }
    }
}