package com.example.subashapplication

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
import com.example.subashapplication.databinding.ActivityCat1Ece1006Binding

class Cat1_phy1005 : AppCompatActivity() {

    var CAT1PHY1005P1: Button?=null
    var CAT1PHY1005P2: Button?=null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat1_phy1005)

        CAT1PHY1005P1=findViewById(R.id.cat1phy1005p1)
        CAT1PHY1005P2=findViewById(R.id.cat1phy1005p2)



        CAT1PHY1005P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1M8LBQoVvKVj6ILEgAkPQQA7FaLcd9T8i/view"))
            startActivity(intent)
        }
        CAT1PHY1005P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1M8_ujRdJELUnX2LALk4TfjtLUb6yT5Zn/view"))
            startActivity(intent)
        }



        }
    }

