package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.subashapplication.databinding.ActivityFatEce1006Binding

class Fat_mat1009 : AppCompatActivity() {
    var FATMAT1009P1: Button?=null
    var FATMAT1009P2: Button?=null







    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_mat1009)

        FATMAT1009P1=findViewById(R.id.fatmat1009p1)
        FATMAT1009P2=findViewById(R.id.fatmat1009p2)



        FATMAT1009P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eTRu8okXUvH6mDCVkNuTUDt4kvJIz8u3/view"))
            startActivity(intent)
        }

        FATMAT1009P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eOHt5TGSB2wrGYJrY_WKlITKpQeIuvZ_/view"))
            startActivity(intent)
        }



    }
    }

