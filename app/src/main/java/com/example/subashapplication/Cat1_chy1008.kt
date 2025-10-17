package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cat1_chy1008 : AppCompatActivity() {

    var CAT1CHY1008P1: Button?=null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_cat1_chy1008)

        CAT1CHY1008P1=findViewById(R.id.cat1chy1008p1)

        CAT1CHY1008P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1MkUyZ5Qhq1JL6FYXRHmj0tpsJ_kdwX7_/view"))
            startActivity(intent)
        }



        }
    }

