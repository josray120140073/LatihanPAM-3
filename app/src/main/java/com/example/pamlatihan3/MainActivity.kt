package com.example.pamlatihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.pamlatihan3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // Variabel binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Menginisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Mengakses elemen UI melalui variabel binding
        binding.textView.text = "Hello, View Binding!"
        binding.button.setOnClickListener {
            Log.d("MainActivity", "Button clicked")
            val intent = Intent(this, Activity2::class.java)
            startActivity(intent)
        }
    }
}
