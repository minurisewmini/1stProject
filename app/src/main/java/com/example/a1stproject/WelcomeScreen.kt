package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton

class WelcomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen) // your welcome screen XML

        // Find views
        val loginBtn = findViewById<MaterialButton>(R.id.loginBtn)
        val signupBtn = findViewById<MaterialButton>(R.id.signupBtn)

        // Navigate to LoginPage
        loginBtn.setOnClickListener {
            val intent = Intent(this, LoginPage::class.java)
            startActivity(intent)
        }

        // Navigate to SignupPage
        signupBtn.setOnClickListener {
            val intent = Intent(this, SignupPage::class.java)
            startActivity(intent)
        }
    }
}
