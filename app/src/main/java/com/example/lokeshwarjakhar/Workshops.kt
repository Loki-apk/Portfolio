package com.example.lokeshwarjakhar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView

class Workshops : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.workshops)

        val link: TextView = findViewById(R.id.link)
        val back: Button = findViewById(R.id.btbackwork)

        link.setOnClickListener {
            startActivity(Intent(this, workcerti::class.java))
            finish()
        }

        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}