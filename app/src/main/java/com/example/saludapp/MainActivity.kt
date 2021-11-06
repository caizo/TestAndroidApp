package com.example.saludapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.saludapp.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        /** setContentView(R.layout.activity_main) usamos binding en lugar de esta forma */
        setContentView(binding.root)

        /**
         * listener para el button
         * En lugar de recuperar el botón así: -> val btnGreeting = findViewById<Button>(R.id.btnGreeting);
         * usamos binding.
         */
        binding.btnGreeting.setOnClickListener{checkName()}
        /** listener para el botón de cargar la activity de RecyclerView */
        binding.btnRecyclerView.setOnClickListener { goToRecyclerViewActivity() }
    }

    /**
     *  Comprobamos si el usuario ha introducido un nombre válido
     */
    private fun checkName(){
        if(binding.etName.text.isNotEmpty()){
            /** Comunicar las 'activities' usando 'intents' */
            val intent = Intent(this,ResultActivity::class.java)
            intent.putExtra("INTENT_NAME",binding.etName.text)
            startActivity(intent)
        } else {
            showErrorName()
        }
    }


    /**
     * Mostrar mensaje de error al usuario si ha dejado el campo nombre vacío
     */
    private fun showErrorName(){
        Toast.makeText(this,getString(R.string.err_name_cannot_be_empty),Toast.LENGTH_SHORT).show()
    }


    fun goToRecyclerViewActivity(){
        val intent = Intent(this,RecyclerViewActivity::class.java)
        startActivity(intent)
    }
}