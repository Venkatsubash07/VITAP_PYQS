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
//import com.example.subashapplication.databinding.ActivityAllmat1007Binding

class All_mat1007 : AppCompatActivity() {

    var MAT1007P1: Button?=null
    var MAT1007P2:Button?=null
    var MAT1007P3:Button?=null
    var MAT1007P4:Button?=null
    var MAT1007P5:Button?=null
    var MAT1007P6:Button?=null
    var MAT1007P7:Button?=null
    var MAT1007P8:Button?=null
    var MAT1007P9:Button?=null
    var MAT1007P10:Button?=null
    var MAT1007P11:Button?=null




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_all_mat1007)

        MAT1007P1=findViewById(R.id.mat1007p1)
        MAT1007P2=findViewById(R.id.mat1007p2)
        MAT1007P3=findViewById(R.id.mat1007p3)
        MAT1007P4=findViewById(R.id.mat1007p4)
        MAT1007P5=findViewById(R.id.mat1007p5)
        MAT1007P6=findViewById(R.id.mat1007p6)
        MAT1007P7=findViewById(R.id.mat1007p7)
        MAT1007P8=findViewById(R.id.mat1007p8)
        MAT1007P9=findViewById(R.id.mat1007p9)
        MAT1007P10=findViewById(R.id.mat1007p10)
        MAT1007P11=findViewById(R.id.mat1007p11)



        MAT1007P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Ld3eAoy0iAy5mYpUztHJ7-f_o7Xz1rbG/view"))
            startActivity(intent)
        }
        MAT1007P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1S_ydP4oPuS7QuO_kvNEVM3a8dy8353wi/view"))
            startActivity(intent)
        }
        MAT1007P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1lCezwWk85M0rtxXUDA5R3e9YMs3KxyHf/view"))
            startActivity(intent)
        }
        MAT1007P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/13E5D7uEK2x_GkOqkscILyUF9a7SOgT4i/view"))
            startActivity(intent)
        }
        MAT1007P5?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-x3Meeq8PpmlVfpbabyNCrAmnoTRo-qo/view"))
            startActivity(intent)
        }
        MAT1007P6?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1oHWwxEGagAarGhEz9mhc1UNniQUFt4CJ/view"))
            startActivity(intent)
        }
        MAT1007P7?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1twtAdE_m6gHDsHNtcy4cQONdoIhh0Cs-/view"))
            startActivity(intent)
        }
        MAT1007P8?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1HA2E3YfOMVRqVES7hRtpEkcCWfEf277V/view"))
            startActivity(intent)
        }
        MAT1007P9?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1scRnQG-7USqHQPEbJp09ehk6XpNc29G3/view"))
            startActivity(intent)
        }
        MAT1007P10?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1SbNhrswFNG6TdQamAb18ewpTfY_UjxAy/view"))
            startActivity(intent)
        }
        MAT1007P11?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1m_Bnc7dA836vyniqIenM7Cs4xkQx70xe/view"))
            startActivity(intent)
        }




    }
    }

