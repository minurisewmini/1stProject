package com.example.a1stproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Root layout reference
        val mainLayout = findViewById<ConstraintLayout>(R.id.mainLayout)

        // Make sure layout is clickable
        mainLayout.isClickable = true
        mainLayout.isFocusable = true

        // Apply system bars padding
        ViewCompat.setOnApplyWindowInsetsListener(mainLayout) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Click listener to open OnboardScreen01
        mainLayout.setOnClickListener {
            val intent = Intent(this, OnboardScreen01::class.java)
            startActivity(intent)
            finish() // optional if you don't want to return to MainActivity
        }
    }
}
