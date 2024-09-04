package com.example.musicplayerprojectkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.musicplayerprojectkotlin.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    lateinit var binding: ActivityAboutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(MainActivity.currentThemeNav[MainActivity.themeIndex])
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.title = "About"
        binding.aboutText.text = aboutText()
    }

    private fun aboutText(): String{
        return "Developed B: Mukesh Kumar" +
                "\n\n If you want to provide feedback, I will love to hear that."
    }
}