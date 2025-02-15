package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.gues1)
        val originalText = "Banana"
        val shuffledText = shuffleText(originalText)
        textView.text = shuffledText

        val btnPrev = findViewById<Button>(R.id.PREV)
        val btnNext = findViewById<Button>(R.id.next)

        btnNext.setOnClickListener {

            val intent = Intent(this, ResultActivity::class.java)
            startActivity(intent)

        }

        btnPrev.setOnClickListener {

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }

    }

    private fun shuffleText(text: String): String {

        val charArray = text.toCharArray()
        for (i in charArray.indices) {

            val randomIndex = Random.nextInt(charArray.size)
            val temp = charArray[i]
            charArray[i] = charArray[randomIndex]
            charArray[randomIndex] = temp

        }
        return String(charArray)
    }

}