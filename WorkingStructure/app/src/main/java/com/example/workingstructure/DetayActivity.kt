package com.example.workingstructure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workingstructure.databinding.ActivityDetayBinding

class DetayActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetayBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val comingName = intent.getStringExtra("name")
        val comingAge = intent.getIntExtra("age", 0)
        val comingHeight = intent.getDoubleExtra("height", 0.0)
        val comingBekar = intent.getBooleanExtra("bekar", false)


        binding.textViewBilgi.text = "$comingName - $comingAge - $comingHeight - $comingBekar"
    }
}