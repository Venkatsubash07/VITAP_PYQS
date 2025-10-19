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
import com.example.subashapplication.databinding.ActivityCat1Ece1006Binding

class Cat2_swe1002 : AppCompatActivity() {

    var CAT2SWE1002P1: Button?=null






    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_swe1002)

        CAT2SWE1002P1=findViewById(R.id.cat2swe1002p1)




        CAT2SWE1002P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KPJvoc_suETCqVKlQVaMrAh5oGb4Nz_G/view"))
            startActivity(intent)
        }






        }
    }

