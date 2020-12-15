package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton

class image : AppCompatActivity() {
    private lateinit var rdoRoman : RadioButton
    private lateinit var rdoDaya : RadioButton
    private lateinit var rdoRajesh : RadioButton
    private lateinit var imgProfile : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)
        rdoRoman.setOnClickListener {
            imgProfile.setImageResource(R.drawable.photo)

        }

        rdoRajesh.setOnClickListener {
            imgProfile.setImageResource(R.drawable.rajesh)

        }
        rdoDaya.setOnClickListener {
            imgProfile.setImageResource(R.drawable.daya)

        }
    }
}