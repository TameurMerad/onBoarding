package com.example.onboarding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        findViewById<ViewPager>(R.id.viewPager).adapter = ViewPagerAdapter(supportFragmentManager)
        val vPager = findViewById<ViewPager>(R.id.viewPager)
        val nextB =findViewById<Button>(R.id.button)

    nextB.setOnClickListener() {
    if (vPager.currentItem + 1 < 2){
        nextB.text = "next"
        vPager.currentItem = vPager.currentItem + 1
    }else if (vPager.currentItem + 1 == 2){
        nextB.text = "continue"
        vPager.currentItem = vPager.currentItem + 1
    }

    else {
        Toast.makeText(this,"continue CLICKED", Toast.LENGTH_SHORT).show()
    }}
}


    }
