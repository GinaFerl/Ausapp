package com.example.ausapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class PlantActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant)

        val txtFlower = findViewById<TextView>(R.id.txtFlower)
        txtFlower.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@PlantActivity, FlowerActivity::class.java)
                startActivity(i)
            }
        })

        val txtFruit = findViewById<TextView>(R.id.txtFruit)
        txtFruit.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val i = Intent(this@PlantActivity, FruitActivity::class.java)
                startActivity(i)
            }
        })

        val txtVegetable = findViewById<TextView>(R.id.txtVegetable)
        txtVegetable.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                val i = Intent(this@PlantActivity, VegetableActivity::class.java)
                startActivity(i)
            }
        })

    }
}