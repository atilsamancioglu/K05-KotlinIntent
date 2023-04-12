package com.atilsamancioglu.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.atilsamancioglu.kotlinintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        println("on create called")
    }


    override fun onResume() {
        super.onResume()

        println("on resume called")

    }


    override fun onPause() {
        super.onPause()

        println("on pause called")

    }

    override fun onStop() {
        super.onStop()

        println("on stop called")

    }

    override fun onDestroy() {
        super.onDestroy()

        println("on destroy called")

    }

    fun next(view: View){

        val intent = Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("username",binding.userNameText.text.toString())
        intent.putExtra("name",binding.nameText.text.toString())
        startActivity(intent)
        finish()

    }
}
