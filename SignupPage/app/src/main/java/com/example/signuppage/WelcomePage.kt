package com.example.signuppage

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat



class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)



        val Name = intent.getStringExtra(LoginPage.KEY1)
        val Email = intent.getStringExtra(LoginPage.KEY2)
        val Password = intent.getStringExtra(LoginPage.KEY3)

        val Welcome = findViewById<TextView>(R.id.Name)
        Welcome.text = "Welcome ${Name.toString()}"

        val EmailText = findViewById<TextView>(R.id.Email)
        EmailText.text = "Email : ${Email.toString()}"

        val PasswordText = findViewById<TextView>(R.id.Password)
        PasswordText.text = "Password : ${Password.toString()}"


    }
}