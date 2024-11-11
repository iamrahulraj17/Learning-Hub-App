package com.example.learninghub

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cards)

        val android = findViewById<CardView>(R.id.androidDev)
        val web = findViewById<CardView>(R.id.webDev)
        val ios = findViewById<CardView>(R.id.iosDev)
        val ml = findViewById<CardView>(R.id.machineLear)

        android.setOnClickListener{
            val intent = Intent(applicationContext, AndroidDev::class.java)
            startActivity(intent)
        }

        web.setOnClickListener{
            val intent = Intent(applicationContext, WebDev::class.java)
            startActivity(intent)
        }

        ios.setOnClickListener{
            val intent = Intent(applicationContext, IOSDev::class.java)
            startActivity(intent)
        }

        ml.setOnClickListener{
            val intent = Intent(applicationContext, MachineLearning::class.java)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}