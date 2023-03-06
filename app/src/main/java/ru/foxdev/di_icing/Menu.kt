package ru.foxdev.di_icing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    private lateinit var di_icing: Button
    private lateinit var moika_VS: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        supportActionBar?.hide()

        di_icing = findViewById(R.id.di_icing)
        moika_VS = findViewById(R.id.moikaVS)


        di_icing.setOnClickListener {
            var intent = Intent(this@Menu,DiIcing::class.java)
            startActivity(intent)
        }

        moika_VS.setOnClickListener {
            var intent = Intent(this@Menu, MoikaAirkraft::class.java)
            startActivity(intent)
        }
    }
}