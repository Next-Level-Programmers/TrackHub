package com.example.trackhub

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class home : AppCompatActivity() {
    private lateinit var b6: ImageButton
    private lateinit var b1: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        b6=findViewById(R.id.timing)
        b1=findViewById(R.id.track)
        b6.setOnClickListener{
            val intent= Intent(this,timing::class.java)
            startActivity(intent)
        }
        b1.setOnClickListener{
            val intent= Intent(this,location::class.java)
            startActivity(intent)
        }
    }
}