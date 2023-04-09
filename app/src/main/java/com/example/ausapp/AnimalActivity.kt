package com.example.ausapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class AnimalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        val txtHerbivora = findViewById<TextView>(R.id.txtHerbivora)
        txtHerbivora.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@AnimalActivity, HerbivoraActivity::class.java)
                startActivity(intent)
            }
        })

        val txtCarnivora = findViewById<TextView>(R.id.txtCarnivora)
        txtCarnivora.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@AnimalActivity, CarnivoraActivity::class.java)
                startActivity(intent)
            }
        })

        val txtOmnivora = findViewById<TextView>(R.id.txtOmnivora)
        txtOmnivora.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val intent = Intent(this@AnimalActivity, OmnivoraActivity::class.java)
                startActivity(intent)
            }
        })
    }
}