package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_swe1004 : AppCompatActivity() {

    var cat1: Button? = null
    var cat2: Button? = null
    var fat: Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main_swe1004)

        cat1 = findViewById(R.id.cat1swe1004)
        cat2 = findViewById(R.id.cat2swe1004)
        fat = findViewById(R.id.fatswe1004)

        cat1?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat1_swe1004::class.java)
            startActivity(intent)
        }

        cat2?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat2_swe1004::class.java)
            startActivity(intent)
        }

        fat?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Fat_swe1004::class.java)
            startActivity(intent)
        }


    }
    }

