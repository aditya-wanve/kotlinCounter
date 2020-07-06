package com.example.counterkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var counterNumber: Int = 0 ;


    fun addToCounter( view : View){
        counterNumber += 1
        textView.setText(counterNumber.toString())
    }

    fun resetCounter( view : View){
        counterNumber = 0
        textView.setText(counterNumber.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
