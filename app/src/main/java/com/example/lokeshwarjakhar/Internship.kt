package com.example.lokeshwarjakhar

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Internship : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.internship)
        val link: TextView = findViewById(R.id.textView9)
        val back: Button = findViewById(R.id.btbackintern)

        link.setOnClickListener {
            startActivity(Intent(this, interncerti::class.java))
            finish()
        }

        back.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }

}