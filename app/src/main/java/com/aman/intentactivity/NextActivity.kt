package com.aman.intentactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class NextActivity : AppCompatActivity() {
    lateinit var getString1:TextView
    lateinit var getNum1:TextView
    lateinit var getCharacter1:TextView
    lateinit var getDouble1:TextView
    lateinit var getLong1:TextView
    lateinit var getFloat1: TextView
    lateinit var getBoolean1:TextView
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        var stg:String = ""
        var num:Int=0
        var chr:Char= 'a'
        var lng:Long= 0
        var db:Double= 0.0
        var floats:Float= 0.0F
        var bool:Boolean= true

        getString1=findViewById(R.id.tvGetString)
        getNum1=findViewById(R.id.tvGetNumber)
        getCharacter1=findViewById(R.id.tvGetCharacter)
        getLong1=findViewById(R.id.tvGetLong)
        getDouble1=findViewById(R.id.tvGetDouble)
        getFloat1=findViewById(R.id.tvGetFloat)
        getBoolean1=findViewById(R.id.tvGetBoolean)

        intent?.let {
            stg = it.getStringExtra("string").toString()
            num = it.getIntExtra("number",0)
            chr = it.getCharExtra("char",'a')
            lng = it.getLongExtra("lng",0)
            db= it.getDoubleExtra("db",0.0)
            floats = it.getFloatExtra("floats",0.0F)
           bool = it.getBooleanExtra("bool",true)

            getString1.setText(stg)
            getNum1.setText(num.toString())
            getCharacter1.setText(""+chr)
            getLong1.setText(""+lng.toString())
            getDouble1.setText(""+db.toString())
            getFloat1.setText(""+floats.toString())
            getBoolean1.setText(""+bool.toString())
        }

    }
}