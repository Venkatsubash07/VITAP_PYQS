package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity

class Fat_ece1005 : AppCompatActivity() {
    var FATECE1005P1:Button?=null
    var FATECE1005P2: Button?=null



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_ece1005)

        FATECE1005P1=findViewById(R.id.fatece1005p1)
        FATECE1005P2=findViewById(R.id.fatece1005p2)


        FATECE1005P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1NJhq5qkTAY6bopih2zWVbXVih_FVX_Rp/view"))
            startActivity(intent)
        }

        FATECE1005P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1NLm5AWM3IZvmeIfJbPamOYhlFmBOp7_r/view"))
            startActivity(intent)
        }


    }
}

