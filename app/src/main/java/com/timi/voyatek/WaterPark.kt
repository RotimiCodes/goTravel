package com.timi.voyatek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class WaterPark : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_park)

        val graphBtn: Button = findViewById(R.id.graph_btn)
        graphBtn.setOnClickListener{
            gotoGraph()
        }

        val backBtn: Button = findViewById(R.id.back_btn)
        backBtn.setOnClickListener{
            val intent =  Intent (this, Destination::class.java);
            startActivity(intent)
        }
    }



    private fun gotoGraph() {
        val intent =  Intent (this, GraphView::class.java);
        startActivity(intent)
    }


}



