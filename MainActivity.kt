package com.example.myapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //declare the views
        val woof= findViewById<Button>(R.id.btn_Woof)

        woof.setOnClickListener {
            intent= Intent(this,Secondpage ::class.java)
            startActivity(intent)

        }
    }
}