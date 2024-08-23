package com.timi.voyatek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_marketplace)

        val actvBtn: Button = findViewById(R.id.actv_btn)
        actvBtn.setOnClickListener {
            navigateToActivities()
        }


    }

    private fun navigateToActivities() {
        val intent = Intent(this, Activities::class.java)
        startActivity(intent)
    }
}
