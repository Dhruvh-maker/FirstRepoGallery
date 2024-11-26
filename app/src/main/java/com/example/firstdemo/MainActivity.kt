package com.example.firstdemo

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonDark=findViewById<Button>(R.id.btnDark)
        val buttonRead=findViewById<Button>(R.id.btnRead)
       val layout=findViewById<LinearLayout>(R.id.LinearLayout)

        buttonDark.setOnClickListener{
            Toast.makeText(applicationContext, "Uploading...",Toast.LENGTH_SHORT).show()
        }
        buttonRead.setOnClickListener{
            Toast.makeText(applicationContext,"Downloading",Toast.LENGTH_SHORT).show()
        }
    }
}