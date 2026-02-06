package com.example.cafez

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OrderDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_order_details)

        val message = intent.getStringExtra(MainActivity.KEY)

        val ShowMsg = findViewById<TextView>(R.id.ShowMsg)

        ShowMsg.text = message.toString()


    }
}