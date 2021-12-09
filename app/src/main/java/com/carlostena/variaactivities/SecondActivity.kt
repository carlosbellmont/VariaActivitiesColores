package com.carlostena.variaactivities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.carlostena.variaactivities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData = intent.getIntExtra("NUM_ALEATORIO", 0)
        val initialColor = intent.getIntExtra("COLOR_ALEATORIO", 0)

        binding.tvTexto.text = "$initialData"

        binding.root.setBackgroundColor(initialColor)

        binding.bNextActivity2.setOnClickListener {
            LastActivity.launch(this, binding.tvTexto.text.toString(), initialColor)
        }
    }
}