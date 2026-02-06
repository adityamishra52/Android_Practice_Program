package com.example.cafez

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // creating key
    companion object {
        const val KEY = "com.example.cafez.MainActivity.KEY"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        val cname = findViewById<EditText>(R.id.cname)
        val csize = findViewById<EditText>(R.id.csize)
        val name = findViewById<EditText>(R.id.name)
        val email = findViewById<EditText>(R.id.email)
        val order = findViewById<Button>(R.id.order)

        order.setOnClickListener {
            val message = cname.text.toString() + " " + csize.text.toString() + " " + name.text.toString() + " " + email.text.toString()

            intent = Intent(this, OrderDetails::class.java)
            intent.putExtra( KEY, message )
            startActivity(intent)

        }
    }


}