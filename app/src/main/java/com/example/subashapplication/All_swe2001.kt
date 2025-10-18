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
//import com.example.subashapplication.databinding.ActivityAllswe2001Binding

class All_swe2001 : AppCompatActivity() {

    var SWE2001P1: Button?=null
    var SWE2001P2:Button?=null
    var SWE2001P3:Button?=null
    var SWE2001P4:Button?=null
    var SWE2001P5:Button?=null
    var SWE2001P6:Button?=null




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_all_swe2001)

        SWE2001P1=findViewById(R.id.swe2001p1)
        SWE2001P2=findViewById(R.id.swe2001p2)
        SWE2001P3=findViewById(R.id.swe2001p3)
        SWE2001P4=findViewById(R.id.swe2001p4)
        SWE2001P5=findViewById(R.id.swe2001p5)
        SWE2001P6=findViewById(R.id.swe2001p6)



        SWE2001P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zxBuemAwLSa240XtBZdRr1BaMOeE4j8V/view"))
            startActivity(intent)
        }
        SWE2001P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17gClKWayUb-tYbyYoQtFYaKizJp0lz_i/view"))
            startActivity(intent)
        }
        SWE2001P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1yPapBcvStTbFSldQRX6IMFy_0EQDi4Nd/view"))
            startActivity(intent)
        }
        SWE2001P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11NT94ezqREiVylrEbDSqLu4Kh6RWaCii/view"))
            startActivity(intent)
        }
        SWE2001P5?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1jUy_cG1Ga1Yt3FhsfwD11XknfUPh54gk/view"))
            startActivity(intent)
        }
        SWE2001P6?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/17FUUr1BlM0qjHVZb_L1zVnylJXRN5Om1/view"))
            startActivity(intent)
        }





    }
    }

