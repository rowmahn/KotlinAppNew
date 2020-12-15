package com.example.androidapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)
        var btn:Button = findViewById(R.id.btn)
        btn.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("MyAlert")
            builder.setMessage("Are you sure?")
            builder.setIcon(android.R.drawable.ic_dialog_alert)
            builder.setPositiveButton("Yes"){
                dialog, which ->
                Toast.makeText(this,"clicked cancel",Toast.LENGTH_LONG).show()

            }

            builder.setNegativeButton("No"){
                dialog, which ->
                Toast.makeText(this,"clicked No",Toast.LENGTH_LONG).show()

            }

            builder.setNeutralButton("Cancel"){
                dialog, which ->
                Toast.makeText(this,"clicked cancel",Toast.LENGTH_LONG).show()

            }

            val alertDialog:AlertDialog = builder.create()
            alertDialog.setCancelable(false)
            alertDialog.show()

        }

    }
}