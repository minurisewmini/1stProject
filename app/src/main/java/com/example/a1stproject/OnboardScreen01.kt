package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardScreen01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen01)

        // Find the "Next" button
        val btnNext = findViewById<Button>(R.id.btnNext)

        // Handle click → go to OnboardScreen02
        btnNext.setOnClickListener {
            val intent = Intent(this, OnboardScreen2::class.java)
            startActivity(intent)
        }
    }
}
