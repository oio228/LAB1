package com.example.lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)

        btnChangeText.setOnClickListener {
            textView.text = "button was clicked"
        }
    }
}