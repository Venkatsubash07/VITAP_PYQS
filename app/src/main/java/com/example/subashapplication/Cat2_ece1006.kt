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
import com.example.subashapplication.databinding.ActivityCat2Ece1006Binding

class Cat2_ece1006 : AppCompatActivity() {
        var CAT2ECE1006P1: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_ece1006)

        CAT2ECE1006P1=findViewById(R.id.cat2ece1006p1)

        CAT2ECE1006P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1er_4ydCpTay3s5abU1ILhF2_dQCtDAnA/view"))
            startActivity(intent)
        }

        }
    }

