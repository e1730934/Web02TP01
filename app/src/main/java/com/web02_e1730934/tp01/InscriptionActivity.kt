package com.web02_e1730934.tp01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase
import com.web02_e1730934.tp01.models.User

class InscriptionActivity: AppCompatActivity() {
    private lateinit var database: DatabaseReference


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup_activity)
        database = Firebase.database.reference

        val btnSignUp = findViewById<Button>(R.id.btnSignUpAction)

        btnSignUp.setOnClickListener {
            val firstName = findViewById<EditText>(R.id.inputFirstName).text.toString()
            val lastName = findViewById<EditText>(R.id.inputLastName).text.toString()
            val email = findViewById<EditText>(R.id.inputEmailSignUp).text.toString()
            val phoneNumber = findViewById<EditText>(R.id.inputPhoneNumber).text.toString()
            val password = findViewById<EditText>(R.id.inputPasswordOne).text.toString()
            val passwordConfirm = findViewById<EditText>(R.id.inputPasswordTwo).text.toString()

           if (password == passwordConfirm) {
                val user = User(firstName, lastName, email, phoneNumber, password)
               user.email?.let { it1 -> database.child("users").child(it1).setValue(user) }
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
        }



    }
}
