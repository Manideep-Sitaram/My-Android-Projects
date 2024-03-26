package com.example.themeswitcher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDarkMode = findViewById<Button>(R.id.btnDarKMode)
        val btnReadMode = findViewById<Button>(R.id.btnReadMode)
        val layout = findViewById<LinearLayout>(R.id.layout)

        btnDarkMode.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
        }

        btnReadMode.setOnClickListener{
            layout.setBackgroundResource(R.color.yellow)
        }
    }
}