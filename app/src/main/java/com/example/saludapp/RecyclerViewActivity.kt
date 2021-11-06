package com.example.saludapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.saludapp.databinding.ActivityRecyclerViewBinding

class RecyclerViewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerViewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGoBackRV.setOnClickListener { onBackPressed() }
    }
}