package com.example.mycontats

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val firstNAME = "Felix"
        val lastNAME = "Kjellberg"
        val address = "67 milk street"
        val isMale = true
        val dayofbirth = 24
        val monthofbirth = 10
        val yearofbirth = 1989
        val currentyear = 2026
        val age = currentyear - yearofbirth
        val yearstolive = 100 - age
        val ageinmonths = age * 12
        val ageindays = age * 365
        val remainder = yearstolive % 5
        Log.d("MainActivity", "remainder: $remainder")
        Log.d("MainActivity", "yearstoLive: $yearstolive")
        Log.d("MainActivity", "ageinmonths: $ageinmonths")
        Log.d("MainActivity", "ageindays: $ageindays")
        Log.d("MainActivity", "skadoosh, Top of the mornin' to ya, laddies! It's me, $firstNAME $lastNAME, I live at $address, I am male: $isMale, I was born on $dayofbirth/$monthofbirth/$yearofbirth.I'm suffocating in the code I wrote, buried beneath broken logic and silent errors, watching the screen glow while my sanity slowly flickers out. Insert Brofist here")
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}