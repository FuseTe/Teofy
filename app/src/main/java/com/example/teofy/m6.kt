package com.example.teofy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class m6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_m6)

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

        val likedsongs = findViewById<TextView>(R.id.likedsongs)

        likedsongs.setOnClickListener{
            startActivity(Intent(this,m4::class.java))
        }

        val be_a_big_shot = findViewById<TextView>(R.id.be_a_big_shot)

        be_a_big_shot.setOnClickListener{
            startActivity(Intent(this,m1::class.java))
        }

        val ralsei_podcast = findViewById<TextView>(R.id.ralsei_podcast)

        ralsei_podcast.setOnClickListener{
            startActivity(Intent(this,m3::class.java))
        }

        val deltarune = findViewById<TextView>(R.id.deltarune)

        deltarune.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
        }

        val lancer_hip_vibes = findViewById<TextView>(R.id.lancer_hip_vibes)

        lancer_hip_vibes.setOnClickListener{
            startActivity(Intent(this,m2::class.java))
        }

        val searchTop = findViewById<ImageView>(R.id.searchTop)

        searchTop.setOnClickListener{
            startActivity(Intent(this,m7::class.java))
        }
    }
}