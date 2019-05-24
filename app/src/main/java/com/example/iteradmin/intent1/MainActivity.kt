package com.example.iteradmin.intent1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val editTex= findViewById<EditText>(R.id.age)
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            val s:String = editText.text.toString()
            val t:Int = Integer.parseInt(editTex.text.toString())
            val i = Intent(applicationContext,SecondActivity::class.java)
            i.putExtra("name",s)
            i.putExtra("age",t)
            startActivity(i)
        }

    }
}
