package com.example.trackhub

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    private lateinit var b6: Button
    private lateinit var b1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        b6=findViewById(R.id.timing)
        b1=findViewById(R.id.track)
        b6.setOnClickListener{
            val intent= Intent(this,timing::class.java)
            startActivity(intent)
        }
        b6.setOnClickListener{
            val intent= Intent(this,location::class.java)
            startActivity(intent)
        }
    }
}