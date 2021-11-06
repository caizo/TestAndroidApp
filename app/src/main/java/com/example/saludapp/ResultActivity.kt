package com.example.saludapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saludapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    /** binding */
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** binding */
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /** establecer listener del botón para ir atrás */
        binding.btnGoBack.setOnClickListener {
            onBackPressed()
        }
        /** Recuperar el valor de la pantalla anterior (intents) */
        getAndShowName()
    }

    private fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        ("Bienvenido, " + name.toString()).also { binding.tvGreeting.text = it }
    }
}