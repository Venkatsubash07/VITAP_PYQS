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

class Fat_phy1005 : AppCompatActivity() {

    var FATPHY1005P1: Button?=null
    var FATPHY1005P2: Button?=null








    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_phy1005)

        FATPHY1005P1=findViewById(R.id.fatphy1005p1)
        FATPHY1005P2=findViewById(R.id.fatphy1005p2)





        FATPHY1005P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1MBUNsMuQOt6sri9wDeRwR1yDRKZ5_7S9/view"))
            startActivity(intent)
        }

        FATPHY1005P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1M56Ol7F-KgjSzHI9CPSiDij1cI4bKctC/view"))
            startActivity(intent)
        }





    }
    }

