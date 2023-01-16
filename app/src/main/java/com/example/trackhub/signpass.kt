package com.example.trackhub

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class signpass : AppCompatActivity() {
    private lateinit var b1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signpass)
        b1=findViewById(R.id.confirm1)
        b1.setOnClickListener{
            val intent= Intent(this,home::class.java)
            startActivity(intent)
        }
    }
}