package com.example.firstdemo

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.lang.reflect.Modifier


class MainActivity3 : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)





            @Composable
            fun Greeting(name: String, modifier : Modifier) {
                Text {
                    text = "Hello $name!",
                    modifier = modifier
                }
            }


            @Preview(showBackground = true)
            @Composable
            fun BirthdayCardPreview() {
                HappyBirthdayTheme {
                    Greeting("James")
                }
            }
}