package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uploadBtn = findViewById<Button>(R.id.uploadBtn)
        val downloadBtn = findViewById<Button>(R.id.downloadBtn)

        uploadBtn.setOnClickListener{
            Toast.makeText(applicationContext,"Uploading...",Toast.LENGTH_SHORT).show()
        }

        downloadBtn.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading...",Toast.LENGTH_SHORT).show()
        }
    }
}