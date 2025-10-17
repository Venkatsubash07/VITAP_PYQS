package com.example.subashapplication

import android.annotation.SuppressLint
import android.net.Uri
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cat2_ece1005 : AppCompatActivity() {

    var CAT2ECE1005P1: Button?=null
    var CAT2ECE1005P2: Button?=null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_ece1005)

        CAT2ECE1005P1=findViewById(R.id.cat2ece1005p1)
        CAT2ECE1005P2=findViewById(R.id.cat2ece1005p2)

        CAT2ECE1005P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1NV7wHoMPbg-RTm4IQ2h4NSgrtKso5_sS/view"))
            startActivity(intent)
        }

        CAT2ECE1005P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1NKHdLgcvMguhd83jENGtja92D1eZ96lK/view"))
            startActivity(intent)
        }


    }
}

