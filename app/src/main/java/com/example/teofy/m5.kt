package com.example.teofy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class m5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m5)

        val play1 = findViewById<ImageView>(R.id.play1)

        play1.setOnClickListener{
            startActivity(Intent(this,m1::class.java))
        }

        val play2 = findViewById<ImageView>(R.id.play2)

        play2.setOnClickListener{
            startActivity(Intent(this,m2::class.java))
        }

        val play3 = findViewById<ImageView>(R.id.play3)

        play3.setOnClickListener{
            startActivity(Intent(this,m3::class.java))
        }

        val play4 = findViewById<ImageView>(R.id.play4)

        play4.setOnClickListener{
            startActivity(Intent(this,m4::class.java))
        }

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