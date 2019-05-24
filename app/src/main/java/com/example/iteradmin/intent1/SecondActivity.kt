package com.example.iteradmin.intent1

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    @SuppressLint("MissingPermission")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val text = findViewById<TextView>(R.id.textView)
        val tex=findViewById<TextView>(R.id.textVie)
        val button = findViewById<Button>(R.id.modi)

        val i = intent
        val s : String=i.getStringExtra("name")
        val age: Int=i.getIntExtra("age",0)
        text.setText(s)
        tex.setText(age.toString())

        button.setOnClickListener{
            val pin =Intent(Intent.ACTION_CALL)
            pin.setData(Uri.parse("tel:123412536"))
            startActivity(pin)

        }











    }
}
