package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NestedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nested)
    }
}