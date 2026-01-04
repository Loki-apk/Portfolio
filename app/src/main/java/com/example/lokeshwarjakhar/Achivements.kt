package com.example.lokeshwarjakhar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button

class Achivements : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.achivements)

        val back: Button = findViewById(R.id.btbackachive)
        back.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

    }