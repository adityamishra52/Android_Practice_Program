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

class MainActivity2 : AppCompatActivity() {


    lateinit var database : DatabaseReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

        val Login = findViewById<TextView>(R.id.Login)
        val SignUPButton = findViewById<Button>(R.id.SignUPButton)
        val ETname = findViewById<TextView>(R.id.ETname)
        val ETemail = findViewById<TextView>(R.id.ETemail)
        val ETpassword = findViewById<TextView>(R.id.ETpassword)
      Login.setOnClickListener {
          startActivity(Intent(this, LoginPage::class.java))
      }
        
      SignUPButton.setOnClickListener {
          val name = ETname.text.toString()
          val email = ETemail.text.toString()
          val password = ETpassword.text.toString()


          if(name.isNotEmpty() && email.isNotEmpty() && password.isNotEmpty()) {
              val user = User(name, email, password)
              database = FirebaseDatabase.getInstance().getReference("Users")
              database.child(name).setValue(user).addOnSuccessListener {
                  Toast.makeText(this, "User Registered", Toast.LENGTH_SHORT).show()
              }.addOnFailureListener {
                  Toast.makeText(this, "Failed to  Register", Toast.LENGTH_SHORT).show()
              }
          }else{
              Toast.makeText(this, "Please Enter All Fields", Toast.LENGTH_SHORT).show()
          }

      }

    }
}


