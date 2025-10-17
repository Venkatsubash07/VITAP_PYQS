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

class Cat2_mat1008 : AppCompatActivity() {

    var CAT2MAT1008P1: Button?=null
    var CAT2MAT1008P2:Button?=null

    var CAT2MAT1008P3:Button?=null




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_mat1008)

        CAT2MAT1008P1=findViewById(R.id.cat2mat1008p1)
        CAT2MAT1008P2=findViewById(R.id.cat2mat1008p2)
        CAT2MAT1008P3=findViewById(R.id.cat2mat1008p3)


        CAT2MAT1008P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LLfmYkMV04T1NOMj1nG0tdYQ5OMosc4Q/view"))
            startActivity(intent)
        }

        CAT2MAT1008P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LK1XLuRzSnalXoJ1UkwwPPl2jsCgxqqJ/view"))
            startActivity(intent)
        }
        CAT2MAT1008P3?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LvhyvTKjjjPSSVgPvWAWHzH93WUminyD/view"))
            startActivity(intent)
        }



        }
    }

