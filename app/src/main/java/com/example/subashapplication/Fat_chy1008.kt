package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity

class Fat_chy1008 : AppCompatActivity() {
    var FATCHY1008P1:Button?=null
    var FATCHY1008P2: Button?=null



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_chy1008)

        FATCHY1008P1=findViewById(R.id.fatchy1008p1)
        FATCHY1008P2=findViewById(R.id.fatchy1008p2)


        FATCHY1008P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1MVBCKVxBBtkyX8-EVBnYSS0Ubmxm2fra/view"))
            startActivity(intent)
        }

        FATCHY1008P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW,Uri.parse("https://drive.google.com/file/d/1MYLiUihLiiFTiJv4xzyxiPRv_P-Accf5/view"))
            startActivity(intent)
        }


    }
    }

