package com.example.workingstructure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.workingstructure.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonDetay.setOnClickListener {
            //Snackbar.make(it, "Merhaba", Snackbar.LENGTH_SHORT).show()
            //binding.textView.text = "Nasılsın?"

            val intent = Intent(this@MainActivity,DetayActivity::class.java)
            intent.putExtra("name", "Sezin")
            intent.putExtra("age", 15)
            intent.putExtra("height", 1.56)
            intent.putExtra("not married", true)
            startActivity(intent)
        }
    }
}