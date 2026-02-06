package com.example.darkmodeapp

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.linearLayout)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
        val buttonDark = findViewById<Button>(R.id.btnDark)
        val buttonLight = findViewById<Button>(R.id.btnRead)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)

        buttonDark.setOnClickListener{
            //Change to dark mode
            layout.setBackgroundResource(R.color.black)
        }


        buttonLight.setOnClickListener{
            //Change to read mode
            layout.setBackgroundResource(R.color.Yellow)

        }

    }
}