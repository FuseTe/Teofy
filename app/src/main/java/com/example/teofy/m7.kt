package com.example.teofy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class m7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m7)

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

        val symphonic = findViewById<ImageView>(R.id.symphonic)

        symphonic.setOnClickListener{
            startActivity(Intent(this,m1::class.java))
        }

        val metal = findViewById<ImageView>(R.id.metal)

        metal.setOnClickListener{
            startActivity(Intent(this,m1::class.java))
        }

        val electro = findViewById<ImageView>(R.id.electro)

        electro.setOnClickListener{
            startActivity(Intent(this,m2::class.java))
        }

        val lofi = findViewById<ImageView>(R.id.lofihiphop)

        lofi.setOnClickListener{
            startActivity(Intent(this,m3::class.java))
        }
    }
}