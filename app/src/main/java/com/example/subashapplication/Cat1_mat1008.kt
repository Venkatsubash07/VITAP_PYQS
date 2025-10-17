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

class Cat1_mat1008 : AppCompatActivity() {

    var CAT1MAT1008P1: Button?=null
    var CAT1MAT1008P2:Button?=null

    var CAT1MAT1008P3:Button?=null



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat1_mat1008)

        CAT1MAT1008P1=findViewById(R.id.cat1mat1008p1)
        CAT1MAT1008P2=findViewById(R.id.cat1mat1008p2)
        CAT1MAT1008P3=findViewById(R.id.cat1mat1008p3)

        CAT1MAT1008P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LpGsiQKsqF-cyoqAGQyeyTuN8jSYRX9l/view"))
            startActivity(intent)
        }

        CAT1MAT1008P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LVnWHbEAGxEt4KWFPP8DspmoGKqhs37u/view"))
            startActivity(intent)
        }
        CAT1MAT1008P3?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LYjFFtbleysTzlLtR01tycO_OaDGqFcj/view"))
            startActivity(intent)
        }

        }
    }

