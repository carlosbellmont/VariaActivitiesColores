package com.carlostena.variaactivities

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlostena.variaactivities.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var color = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.bNextActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NUM_ALEATORIO", Random.nextInt())
            intent.putExtra("COLOR_ALEATORIO", color)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        color = Color.argb(255, Random.nextInt(256), Random.nextInt(256), Random.nextInt(256))
        binding.root.setBackgroundColor(color)
    }
}