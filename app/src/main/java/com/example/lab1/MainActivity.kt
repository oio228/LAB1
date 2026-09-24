package com.example.lab1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root = findViewById<LinearLayout>(R.id.main)
        val textView = findViewById<TextView>(R.id.textView)
        val btnChangeText = findViewById<Button>(R.id.btnChangeText)
        val btnChangeColor = findViewById<Button>(R.id.btnChangeColor)
        val btnChangeBg = findViewById<Button>(R.id.btnChangeBg)

        btnChangeText.setOnClickListener {
            textView.text = "button was clicked"
        }

        btnChangeColor.setOnClickListener {
            textView.setTextColor(Color.RED)
        }

        btnChangeBg.setOnClickListener {
            root.setBackgroundColor(Color.CYAN)
        }
    }
}
