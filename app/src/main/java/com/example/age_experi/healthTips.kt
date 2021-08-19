package com.example.age_experi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_health_tips.*
import kotlinx.android.synthetic.main.activity_main.*

class healthTips : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_health_tips)

        food.setOnClickListener {
            val intent = Intent(this, Food::class.java)
            startActivity(intent)

            organic.setOnClickListener {
                val intent = Intent(this, Organic::class.java)
                startActivity(intent)

                excercise.setOnClickListener {
                    val intent = Intent(this, Excercise::class.java)
                    startActivity(intent)

                  meditation.setOnClickListener {
                        val intent = Intent(this, Meditation::class.java)
                        startActivity(intent)

                      sports.setOnClickListener {
                          val intent = Intent(this, Sports::class.java)
                          startActivity(intent)

        button2.setOnClickListener {
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://dev-blackswanphotography.pantheonsite.io/"))
            startActivity(i)
        }

    }
}}}}}}