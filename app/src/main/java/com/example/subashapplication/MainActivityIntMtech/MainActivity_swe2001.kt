package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.subashapplication.Cat1_swe2005
import com.example.subashapplication.Cat2_swe2005
import com.example.subashapplication.Fat_swe2005
import com.example.subashapplication.R

class MainActivity_swe2001 : AppCompatActivity() {

    var cat1: Button? = null
    var cat2: Button? = null
    var fat: Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main_swe2001)

        cat1 = findViewById(R.id.cat1swe2001)
        cat2 = findViewById(R.id.cat2swe2001)
        fat = findViewById(R.id.fatswe2001)



        cat2?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat2_swe2001::class.java)
            startActivity(intent)
        }

        fat?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Fat_swe2001::class.java)
            startActivity(intent)
        }


    }
    }

