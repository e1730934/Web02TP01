package com.web02_e1730934.tp01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val lblLogin = findViewById<TextView>(R.id.lblConnexionRedirection)
        val lblInscription = findViewById<TextView>(R.id.lblInscription)
        val lblUpdate = findViewById<TextView>(R.id.lblModificationProfile)
        val lblDisconnect = findViewById<TextView>(R.id.lblDeconnexionRedirection)

        lblLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        lblInscription.setOnClickListener {
            val intent = Intent(this, InscriptionActivity::class.java)
            startActivity(intent)
        }
        lblUpdate.setOnClickListener {
            val intent = Intent(this, UpdateActivity::class.java)
            startActivity(intent)
        }
    }
}
