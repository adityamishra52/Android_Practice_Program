package com.example.splashscreen

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val ShowMsg = findViewById<TextView>(R.id.showmsg)

        val Name = intent.getStringExtra("Name")
        val Password = intent.getStringExtra("Password")

        ShowMsg.text = "Name: $Name\nPassword: $Password"



    }
}