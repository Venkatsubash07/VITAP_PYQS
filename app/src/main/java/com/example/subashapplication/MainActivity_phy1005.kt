package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity_phy1005 : AppCompatActivity() {

    var cat1: Button? = null
    var cat2: Button? = null
    var fat: Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main_phy1005)

        cat1 = findViewById(R.id.cat1phy1005)
        cat2 = findViewById(R.id.cat2phy1005)
        fat = findViewById(R.id.fatphy1005)

        cat1?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat1_phy1005::class.java)
            startActivity(intent)
        }

        cat2?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat2_phy1005::class.java)
            startActivity(intent)
        }

        fat?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Fat_phy1005::class.java)
            startActivity(intent)
        }


    }
    }

