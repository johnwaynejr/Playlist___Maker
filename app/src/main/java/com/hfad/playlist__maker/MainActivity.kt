package com.hfad.playlist___maker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFind = findViewById<Button>(R.id.btnFind)
           btnFind.setOnClickListener {
                val displayIntent = Intent(this, FindActivity::class.java)
                startActivity(displayIntent)
            }

        val btnMedia = findViewById<Button>(R.id.btnMedia)
        btnMedia.setOnClickListener {
            val displayIntent = Intent(this, MedialibraryActivity::class.java)
            startActivity(displayIntent)
        }

        val btnSettings = findViewById<Button>(R.id.btnSettings)
        btnSettings.setOnClickListener {
            val displayIntent = Intent(this, SettigsActivity::class.java)
            startActivity(displayIntent)
        }

    }
}