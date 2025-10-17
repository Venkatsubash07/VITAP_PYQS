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

class Fat_mat1008 : AppCompatActivity() {
    var FATMAT1008P1: Button?=null
    var FATMAT1008P2: Button?=null







    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_mat1008)

        FATMAT1008P1=findViewById(R.id.fatmat1008p1)
        FATMAT1008P2=findViewById(R.id.fatmat1008p2)



        FATMAT1008P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LzJsBln5zeun3wv2VaTObyuf6TaR21ky/view"))
            startActivity(intent)
        }

        FATMAT1008P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Lma7kuKadjf6-P6OwiAMmFua68sbzKDu/view"))
            startActivity(intent)
        }



    }
    }

