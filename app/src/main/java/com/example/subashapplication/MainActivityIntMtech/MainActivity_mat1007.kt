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

class MainActivity_mat1007 : AppCompatActivity() {

    var cat1: Button? = null
    var cat2: Button? = null
    var fat: Button? = null

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main_mat1007)

        cat1 = findViewById(R.id.cat1mat1007)
        cat2 = findViewById(R.id.cat2mat1007)
        fat = findViewById(R.id.fatmat1007)

        cat1?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat1_mat1007::class.java)
            startActivity(intent)
        }

        cat2?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat2_mat1007::class.java)
            startActivity(intent)
        }

        fat?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Fat_mat1007::class.java)
            startActivity(intent)
        }


    }
    }

