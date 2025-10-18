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
//import com.example.subashapplication.databinding.ActivityAllswe2007Binding

class All_swe2007 : AppCompatActivity() {

    var SWE2007P1: Button?=null
    var SWE2007P2:Button?=null
    var SWE2007P3:Button?=null
    var SWE2007P4:Button?=null
    var SWE2007P5:Button?=null
    var SWE2007P6:Button?=null
    var SWE2007P7:Button?=null
    var SWE2007P8:Button?=null
    var SWE2007P9:Button?=null
    var SWE2007P10:Button?=null





    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_all_swe2007)

        SWE2007P1=findViewById(R.id.swe2007p1)
        SWE2007P2=findViewById(R.id.swe2007p2)
        SWE2007P3=findViewById(R.id.swe2007p3)
        SWE2007P4=findViewById(R.id.swe2007p4)
        SWE2007P5=findViewById(R.id.swe2007p5)
        SWE2007P6=findViewById(R.id.swe2007p6)
        SWE2007P7=findViewById(R.id.swe2007p7)
        SWE2007P8=findViewById(R.id.swe2007p8)
        SWE2007P9=findViewById(R.id.swe2007p9)
        SWE2007P10=findViewById(R.id.swe2007p10)




        SWE2007P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JptJdSJXhuXAnzvJOham_HhMSuHyTIs6/view"))
            startActivity(intent)
        }
        SWE2007P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-fwL-1Y_W-qSk0cejHnehl38Mfkx0137/view"))
            startActivity(intent)
        }
        SWE2007P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-w_nzKNUppr8cevqYlM1wzz-LaImosiV/view"))
            startActivity(intent)
        }
        SWE2007P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1G-qbaj02pQX1t9oXVoqkoRqMEod6Bemw/view"))
            startActivity(intent)
        }
        SWE2007P5?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-SSqK_3s1Tbz1NUbQ1A5axiYPqpDsH6n/view"))
            startActivity(intent)
        }
        SWE2007P6?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1OIaxVjmHKB01dxN-Iu20EZKBsN3vmBcb/view"))
            startActivity(intent)
        }
        SWE2007P7?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1wXF7LmeTnWE3aAtsQbZ3eu6gDns_rHBL/view"))
            startActivity(intent)
        }
        SWE2007P8?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/11Oa26D-QBy94sT7CHNW9zJIxu1ZkDmVW/view"))
            startActivity(intent)
        }
        SWE2007P9?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LyrRgYMHv2QWRlBl2tgUG8Yvqkilx4tI/view"))
            startActivity(intent)
        }
        SWE2007P10?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WBVg-5phQy-po-g3-Fek7x0nf3ftStSc/view"))
            startActivity(intent)
        }





    }
    }

