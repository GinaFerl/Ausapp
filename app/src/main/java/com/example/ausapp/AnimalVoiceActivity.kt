package com.example.ausapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class AnimalVoiceActivity : AppCompatActivity() {
    private lateinit var mediaPlayer : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal_voice)

        val play1 = findViewById<ImageView>(R.id.v1)
        play1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.cow_voice)
                mediaPlayer.start()


            }
        })

        val play2 = findViewById<ImageView>(R.id.v2)
        play2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.goat_voice)
                mediaPlayer.start()
            }
        })

        val play3 = findViewById<ImageView>(R.id.v3)
        play3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.dolphin_voice)
                mediaPlayer.start()
            }
        })

        val play4 = findViewById<ImageView>(R.id.v4)
        play4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.cat_voice)
                mediaPlayer.start()
            }
        })

        val play5 = findViewById<ImageView>(R.id.v5)
        play5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.dog_voice)
                mediaPlayer.start()
            }
        })

        val play6 = findViewById<ImageView>(R.id.v6)
        play6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.lion_voice)
                mediaPlayer.start()
            }
        })

        val play7 = findViewById<ImageView>(R.id.v7)
        play7.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.wolf_voice)
                mediaPlayer.start()
            }
        })

        val play8 = findViewById<ImageView>(R.id.v8)
        play8.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.monkey_voice)
                mediaPlayer.start()
            }
        })

        val play9 = findViewById<ImageView>(R.id.v9)
        play9.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.elephant_voice)
                mediaPlayer.start()
            }
        })

        val play10 = findViewById<ImageView>(R.id.v10)
        play10.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                mediaPlayer = MediaPlayer.create(applicationContext, R.raw.owl_voice)
                mediaPlayer.start()
            }
        })
    }
}