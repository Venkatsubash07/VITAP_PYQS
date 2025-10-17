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

class Cat1_mat1014 : AppCompatActivity() {

    var CAT1MAT1014P1: Button?=null
    var CAT1MAT1014P2: Button?=null





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat1_mat1014)

        CAT1MAT1014P1=findViewById(R.id.cat1mat1014p1)
        CAT1MAT1014P2=findViewById(R.id.cat1mat1014p2)



        CAT1MAT1014P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1dudFmC_AFvMcC6LO79PzCBEyJ6p0KUGz/view"))
            startActivity(intent)
        }
        CAT1MAT1014P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("http://drive.google.com/file/d/1e3Nwz4DHEiPETfAYbMnTEW5bwL-Sub-B/view"))
            startActivity(intent)
        }



        }
    }

