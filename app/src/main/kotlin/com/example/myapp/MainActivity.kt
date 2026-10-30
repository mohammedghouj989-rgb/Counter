package com.example.myapp

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var counter = 0 
        val tvCounter = findViewById<TextView>(R.id.tvCounter)
        val buttonIncrement = findViewById<Button>(R.id.buttonIncrement)
        val buttonneg = findViewById<Button>(R.id.buttonneg)
        val Reset = findViewById<Button>(R.id.Reset)
        var Warn = "لا يمكنني طباعة قيم سالبة"
        
        buttonIncrement.setOnClickListener(){
            counter++
            tvCounter.text = counter.toString()
        }
        
        buttonneg.setOnClickListener(){
            if (counter == 0){
                tvCounter.text = Warn.toString()
            }else{
                counter--
                tvCounter.text = counter.toString()
            }
        }
        
        Reset.setOnClickListener(){
            counter = 0
            tvCounter.text = counter.toString()
        }
    }
}
