package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import android.widget.ImageButton

class OnboardScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen3)

        // Back button → OnboardScreen2
        val btnBack: ImageButton = findViewById(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, OnboardScreen2::class.java)
            startActivity(intent)
            finish()
        }

        // Get Started button → WelcomeScreen
        val btnGetStarted: MaterialButton = findViewById(R.id.btnGetStarted)
        btnGetStarted.setOnClickListener {
            val intent = Intent(this, WelcomeScreen::class.java)
            startActivity(intent)
            // ❌ don't call finish(), so pressing back will return here
        }
    }
}
