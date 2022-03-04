package com.bangkit.layout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Google Pixel"

        val btnOtherLayouts: Button = findViewById(R.id.btn_otherlayouts)
        btnOtherLayouts.setOnClickListener{
            val moveToOtherActivities = Intent(this@MainActivity, OtherActivities::class.java)
            startActivity(moveToOtherActivities)
        }


    }
}