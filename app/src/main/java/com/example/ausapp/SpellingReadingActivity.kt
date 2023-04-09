package com.example.ausapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SpellingReadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spelling_reading)

        val txt1 = findViewById<TextView>(R.id.txt1)
        txt1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread1Activity::class.java)
                startActivity(i)
            }
        })

        val txt2 = findViewById<TextView>(R.id.txt2)
        txt2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread2Activity::class.java)
                startActivity(i)
            }
        })

        val txt3 = findViewById<TextView>(R.id.txt3)
        txt3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread3Activity::class.java)
                startActivity(i)
            }
        })

        val txt4 = findViewById<TextView>(R.id.txt4)
        txt4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread4Activity::class.java)
                startActivity(i)
            }
        })

        val txt5 = findViewById<TextView>(R.id.txt5)
        txt5.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread5Activity::class.java)
                startActivity(i)
            }
        })

        val txt6 = findViewById<TextView>(R.id.txt6)
        txt6.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread6Activity::class.java)
                startActivity(i)
            }
        })

        val txt7 = findViewById<TextView>(R.id.txt7)
        txt7.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread7Activity::class.java)
                startActivity(i)
            }
        })

        val txt8 = findViewById<TextView>(R.id.txt8)
        txt8.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread8Activity::class.java)
                startActivity(i)
            }
        })

        val txt9 = findViewById<TextView>(R.id.txt9)
        txt9.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread9Activity::class.java)
                startActivity(i)
            }
        })

        val txt10 = findViewById<TextView>(R.id.txt10)
        txt10.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@SpellingReadingActivity, Spellread10Activity::class.java)
                startActivity(i)
            }
        })
    }
}