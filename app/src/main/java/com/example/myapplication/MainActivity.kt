package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val myCard = findViewById<androidx.cardview.widget.CardView>(R.id.card1)
        val myCard1 = findViewById<androidx.cardview.widget.CardView>(R.id.card2)
        val myCard2 = findViewById<androidx.cardview.widget.CardView>(R.id.card3)
        val myCard3 = findViewById<androidx.cardview.widget.CardView>(R.id.card4)

        myCard3.setOnClickListener {

            val intent = Intent(this, FiveActivity::class.java)
            startActivity(intent)

        }

        myCard2.setOnClickListener {

            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)

        }

        myCard1.setOnClickListener {

            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)

        }

        myCard.setOnClickListener {

            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
    }
}