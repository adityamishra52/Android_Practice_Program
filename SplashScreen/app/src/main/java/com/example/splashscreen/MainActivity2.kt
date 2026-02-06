package com.example.splashscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val Name = findViewById<EditText>(R.id.Name)
        val Password = findViewById<EditText>(R.id.Password)
        val Submit = findViewById<Button>(R.id.button)

        Submit.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("Name", Name.text.toString())
            intent.putExtra("Password", Password.text.toString())
            startActivity(intent)

        }

    }
}