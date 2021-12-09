package com.carlostena.variaactivities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.carlostena.variaactivities.databinding.ActivityLastBinding

class LastActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLastBinding

    companion object {

        const val TAG_TEXT = "TAG_TEXT"

        fun launch(context: Context, text: String) {
            val intent = Intent(context, LastActivity::class.java)
            intent.putExtra(TAG_TEXT, text)
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLastBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val initialData = intent.getStringExtra(TAG_TEXT)

        binding.tvTexto.text = initialData
    }
}