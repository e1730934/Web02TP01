package com.web02_e1730934.tp01

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_activity)

        val btnInscription = findViewById<Button>(R.id.btnSignUpInLoginPage)
        btnInscription.setOnClickListener {
            val intent = Intent(this, InscriptionDansBD::class.java)
            startActivity(intent)
        }
    }
}
