package com.carlostena.variaactivities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlostena.variaactivities.databinding.ActivityLastBinding

class LastActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLastBinding

    companion object {

        private const val TAG_TEXT = "TAG_TEXT"
        private const val TAG_COLOR = "TAG_COLOR"

        fun launch(context: Context, text: String, initialColor: Int) {
            val intent = Intent(context, LastActivity::class.java)
            intent.putExtra(TAG_TEXT, text)
            intent.putExtra(TAG_COLOR, initialColor)

            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData = intent.getStringExtra(TAG_TEXT)
        val initialColor = intent.getIntExtra(TAG_COLOR, 0)

        binding.tvTexto.text = initialData
        binding.root.setBackgroundColor(initialColor)
    }
}