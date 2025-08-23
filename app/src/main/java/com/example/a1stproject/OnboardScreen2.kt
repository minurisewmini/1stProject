package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import android.widget.ImageButton

class OnboardScreen2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboard_screen2)

        // Buttons
        val btnNext: MaterialButton = findViewById(R.id.btn_next)
        val btnSkip: MaterialButton = findViewById(R.id.btn_skip)
        val btnBack: ImageButton = findViewById(R.id.btnBack)

        // Next button -> OnboardScreen3
        btnNext.setOnClickListener {
            val intent = Intent(this, OnboardScreen3::class.java)
            startActivity(intent)
            finish() // optional, remove this screen from back stack
        }

        // Skip button -> OnboardScreen3
        btnSkip.setOnClickListener {
            val intent = Intent(this, OnboardScreen3::class.java)
            startActivity(intent)
            finish()
        }

        // Back button -> OnboardScreen1
        btnBack.setOnClickListener {
            val intent = Intent(this, OnboardScreen01::class.java)
            startActivity(intent)
            finish()
        }
    }
}
