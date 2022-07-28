package com.aman.intentactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var string1 :EditText
    lateinit var num1:EditText
    lateinit var char1:EditText
    lateinit var double1:EditText
    lateinit var long1:EditText
    lateinit var float1:EditText
    lateinit var boolean1:EditText
    lateinit var button1:Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        string1=findViewById(R.id.etString)
        num1=findViewById(R.id.etNumber)
        char1=findViewById(R.id.etCharacter)
        double1=findViewById(R.id.etDouble)
        long1=findViewById(R.id.etLong)
        float1=findViewById(R.id.etFloat)
        boolean1=findViewById(R.id.etBoolean)
        button1=findViewById(R.id.btnNext)

        button1.setOnClickListener{

            var intent = Intent(this,NextActivity::class.java)
            intent.putExtra("string",string1.text.toString())
            intent.putExtra("Number",num1.text.toString().toInt())
            intent.putExtra("char",char1.text.toString())
            intent.putExtra("double",(double1.text.toString()).toDouble())
            intent.putExtra("long",(long1.text.toString()).toLong())
            intent.putExtra("Float",(float1.text.toString()).toFloat())
            intent.putExtra("bool",boolean1 as Boolean)
            startActivity(intent)
        }

    }
}