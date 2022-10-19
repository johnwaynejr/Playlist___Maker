package com.hfad.playlist___maker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnFindId = findViewById<Button>(R.id.btnFind)
           btnFindId.setOnClickListener {
                val displayIntent = Intent(this, FindActivity::class.java)
                startActivity(displayIntent)
            }

        val btnMediaId = findViewById<Button>(R.id.btnMedia)
        btnMediaId.setOnClickListener {
            val displayIntent = Intent(this, MedialibraryActivity::class.java)
            startActivity(displayIntent)
        }

        val btnSettingsId = findViewById<Button>(R.id.btnSettings)
        btnSettingsId.setOnClickListener {
            val displayIntent = Intent(this, SettigsActivity::class.java)
            startActivity(displayIntent)
        }

    }
}