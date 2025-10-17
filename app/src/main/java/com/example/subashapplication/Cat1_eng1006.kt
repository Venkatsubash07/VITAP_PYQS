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

class Cat1_eng1006 : AppCompatActivity() {

    var CAT1ENG1006P1: Button?=null
    var CAT1ENG1006P2:Button?=null

    var CAT1ENG1006P3:Button?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat1_eng1006)

        CAT1ENG1006P1=findViewById(R.id.cat1eng1006p1)
        CAT1ENG1006P2=findViewById(R.id.cat1eng1006p2)
        CAT1ENG1006P3=findViewById(R.id.cat1eng1006p3)

        CAT1ENG1006P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KuiZ5LBHi4eZxqTpepK9AZSl8_j4K733/view"))
            startActivity(intent)
        }

        CAT1ENG1006P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Kcu746KJf1t95X1SLZ9Sva1Ed7IqiL2l/view"))
            startActivity(intent)
        }
        CAT1ENG1006P3?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KZA-qfkvwhpkeo6LF49JwxuTda6N-wRT/view"))
            startActivity(intent)
        }

        }
    }

