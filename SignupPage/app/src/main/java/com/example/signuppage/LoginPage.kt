package com.example.signuppage

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase




class LoginPage : AppCompatActivity() {
    companion object {
        const val KEY1 = "com.example.signupPage.LoginPage.Name"
        const val KEY2 = "com.example.signupPage.Email"
        const val KEY3 = "com.example.signupPage.Password"
    }

    lateinit var database: DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)

        val SignUp = findViewById<TextView>(R.id.SignUP)
        val Login = findViewById<Button>(R.id.LoginButton)
        val Name = findViewById<TextView>(R.id.Name)
        val Password = findViewById<TextView>(R.id.Password)

        SignUp.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }
        Login.setOnClickListener {
            val name = Name.text.toString()
            val password = Password.text.toString()

            if (name.isNotEmpty() && password.isNotEmpty()) {
                readData(name, password)
            } else {
                Toast.makeText(this, "Please Enter All Fields", Toast.LENGTH_SHORT).show()
            }


        }

    }

    private fun readData(name: String, password: String) {
        database = FirebaseDatabase.getInstance().getReference("Users")
        database.child(name).get().addOnSuccessListener {
            if (it.exists()) {
                val passwordFromDB = it.child("password").value
                if (password == passwordFromDB) {
                    Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                    val Name = it.child("name").value
                    val Email = it.child("email").value
                    val Password = it.child("password").value
                    val intentWelcome = Intent(this, WelcomePage::class.java)
                    intentWelcome.putExtra(KEY1, Name.toString())
                    intentWelcome.putExtra(KEY2, Email.toString())
                    intentWelcome.putExtra(KEY3, Password.toString())
                    startActivity(intentWelcome)
                } else {
                    Toast.makeText(this, "Wrong Password", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "User Doesn't Exist", Toast.LENGTH_SHORT).show()

            }

        }


    }
}