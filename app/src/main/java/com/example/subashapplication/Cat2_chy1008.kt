package com.example.subashapplication

import android.annotation.SuppressLint
import android.net.Uri
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cat2_chy1008 : AppCompatActivity() {

    var CAT2CHY1008P1: Button?=null
    var CAT2CHY1008P2: Button?=null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_chy1008)

        CAT2CHY1008P1=findViewById(R.id.cat2chy1008p1)
        CAT2CHY1008P2=findViewById(R.id.cat2chy1008p2)

        CAT2CHY1008P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1MsMtVLzEEg5MLCJCJ43Cg-Lud5qbKwzE/view"))
            startActivity(intent)
        }

        CAT2CHY1008P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1Ms_rAeKRquKlvCtx6iWlYKBhD9ImHlsy/view"))
            startActivity(intent)
        }


    }
    }

