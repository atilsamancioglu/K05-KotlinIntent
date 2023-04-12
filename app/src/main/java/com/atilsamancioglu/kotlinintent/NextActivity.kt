package com.atilsamancioglu.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.atilsamancioglu.kotlinintent.databinding.ActivityNextBinding

class NextActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNextBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNextBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //getIntent
        val intent = intent
        val username = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")

        binding.userNameTextNextActivity.text = "Username: " + username
        binding.nameTextNextActivity.text = "Name: " + name

    }
}
