package com.example.zd1_erohin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.example.zd1_erohin.R

class MainActivity2 : AppCompatActivity() {
    lateinit var tex : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var tex1 = findViewById<TextView>(R.id.secondtext)
        var l = getIntent().getStringExtra("Log")
        tex1.text = l.toString()
    }
}