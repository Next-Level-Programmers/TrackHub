 package com.example.trackhub

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText

 class MainActivity : AppCompatActivity() {
     private lateinit var phone:EditText
     private lateinit var password: EditText
     private lateinit var b1:Button
     private lateinit var b2:Button
     private lateinit var b3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        phone=findViewById(R.id.editTextPhone2)
        password=findViewById(R.id.editTextTextPassword)
        b1=findViewById(R.id.button)
        b2=findViewById(R.id.button2)
        b3=findViewById(R.id.button3)

        b1.setOnClickListener{
            val intent= Intent(this,home::class.java)
            startActivity(intent)
        }
        b2.setOnClickListener{
            val intent=Intent(this,resetmob::class.java)
            startActivity(intent)
        }
        b3.setOnClickListener{
            val intent=Intent(this,sognmob::class.java)
            startActivity(intent)
        }
    }
 }