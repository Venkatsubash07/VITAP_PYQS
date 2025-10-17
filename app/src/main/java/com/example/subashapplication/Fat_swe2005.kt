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

class Fat_swe2005 : AppCompatActivity() {

    var FATSWE2005P1: Button?=null
    var FATSWE2005P2: Button?=null








    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_swe2005)

        FATSWE2005P1=findViewById(R.id.fatswe2005p1)
        FATSWE2005P2=findViewById(R.id.fatswe2005p2)





        FATSWE2005P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1hD34fcV6aj-FDDTUujmecf53wXC8RUdT/view"))
            startActivity(intent)
        }

        FATSWE2005P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1h0jFoFT3bjE6DkIfaW-KYcLIi6A5lbpq/view"))
            startActivity(intent)
        }





    }
    }

