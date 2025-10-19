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

class Cat2_mat1007 : AppCompatActivity() {
        var CAT2MAT1007P1: Button?=null
    var CAT2MAT1007P2: Button?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_mat1007)

        CAT2MAT1007P1=findViewById(R.id.cat2mat1007p1)
        CAT2MAT1007P2=findViewById(R.id.cat2mat1007p1)


        CAT2MAT1007P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1O0r7EdLnI0Rd0-gHhC6THuh11poBDtZk/view"))
            startActivity(intent)
        }
        CAT2MAT1007P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1DANiqXSmlVAsrIhLgol-hlcTssxMVmRg/view"))
            startActivity(intent)
        }

        }
    }

