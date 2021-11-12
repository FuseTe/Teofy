package com.example.teofy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class m3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m3)

        val home = findViewById<ImageView>(R.id.home)

        home.setOnClickListener{
            startActivity(Intent(this,m5::class.java))
        }

        val search = findViewById<ImageView>(R.id.search)

        search.setOnClickListener{
            startActivity(Intent(this,m7::class.java))
        }

        val library = findViewById<ImageView>(R.id.library)

        library.setOnClickListener{
            startActivity(Intent(this,m7::class.java))
        }
    }
}