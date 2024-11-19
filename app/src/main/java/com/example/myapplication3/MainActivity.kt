package com.example.myapplication3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnClickMe= findViewById<Button>(R.id.Button1)
        val btnClickMe2= findViewById<Button>(R.id.Button2)
        val btnExit= findViewById<Button>(R.id.exitbutton)
        val textData2= findViewById<TextView>(R.id.textView2)
        var timesclicked =0
        btnClickMe.setOnClickListener {
            timesclicked+=1
            textData2.text=timesclicked.toString()
        }
        val textData= findViewById<TextView>(R.id.textView)
        textData.text="People counter"

        btnClickMe2.setOnClickListener {
            timesclicked =0
            textData2.text=timesclicked.toString()
        }
        
    }
}