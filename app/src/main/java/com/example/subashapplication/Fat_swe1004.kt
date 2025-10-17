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

class Fat_swe1004 : AppCompatActivity() {

    var FATSWE1004P1: Button?=null
    var FATSWE1004P2: Button?=null








    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_swe1004)

        FATSWE1004P1=findViewById(R.id.fatswe1004p1)
        FATSWE1004P2=findViewById(R.id.fatswe1004p2)





        FATSWE1004P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ghBtCeiK6x28LGotn25gByaL4gQtgOHV/view"))
            startActivity(intent)
        }

        FATSWE1004P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1gneKz7A7x6Y8uf4aRRnTwaX2ykKJ9OZr/view"))
            startActivity(intent)
        }





    }
    }

