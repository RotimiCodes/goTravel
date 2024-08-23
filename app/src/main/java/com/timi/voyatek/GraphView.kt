package com.timi.voyatek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GraphView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graph_view)

        val backBtn: Button = findViewById(R.id.back_btn)
        backBtn.setOnClickListener{
            val intent =  Intent (this, WaterPark::class.java);
            startActivity(intent)
        }
    }
}