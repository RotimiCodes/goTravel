package com.timi.voyatek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Destination : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_destinations)

        val searchBtn: Button = findViewById(R.id.gotoaplace)
        searchBtn.setOnClickListener {
            navigateToDest()
        }

        val backBtn: Button = findViewById(R.id.back_btn)
        backBtn.setOnClickListener{
            goBack()
        }
    }

    private fun navigateToDest() {
        val intent2 = Intent(this, WaterPark::class.java)
        startActivity(intent2)
    }

    private fun goBack() {
        val intent2 = Intent(this, Activities::class.java)
        startActivity(intent2)
    }



}