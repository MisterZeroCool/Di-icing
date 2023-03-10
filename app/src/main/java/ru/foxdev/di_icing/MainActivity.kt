package ru.foxdev.di_icing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var enterButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        enterButton = findViewById(R.id.enterButton)

        enterButton.setOnClickListener {
            var intent = Intent(this@MainActivity, Menu::class.java)
            startActivity(intent)
        }
    }
}