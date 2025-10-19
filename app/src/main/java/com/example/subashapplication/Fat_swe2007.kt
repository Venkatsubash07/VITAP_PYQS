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

class Fat_swe2007 : AppCompatActivity() {

    var FATSWE2007P1: Button?=null
    var FATSWE2007P2: Button?=null
    var FATSWE2007P3: Button?=null
    var FATSWE2007P4: Button?=null
    var FATSWE2007P5: Button?=null










    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_swe2007)

        FATSWE2007P1=findViewById(R.id.fatswe2007p1)
        FATSWE2007P2=findViewById(R.id.fatswe2007p2)
        FATSWE2007P3=findViewById(R.id.fatswe2007p3)
        FATSWE2007P4=findViewById(R.id.fatswe2007p4)
        FATSWE2007P5=findViewById(R.id.fatswe2007p5)







        FATSWE2007P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1xrOuHcN-cxowOKYgtGZ2bz73OBztPv-T/view"))
            startActivity(intent)
        }

        FATSWE2007P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1JG5fCRsb3yAN6UddlqKKNCcb7vvj-B5l/view"))
            startActivity(intent)
        }

        FATSWE2007P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1j5tTNZUdl1CCai5G-BMP7xsaeRKWwxE-/view"))
            startActivity(intent)
        }

        FATSWE2007P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1N14GQyLNVyOE9pOPCW--4JQAthu_zmt2/view"))
            startActivity(intent)
        }
        FATSWE2007P5?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vHQRbxQCfWiV_Q8dp4CTJfPH_Ufl8NhU/view"))
            startActivity(intent)
        }






    }
    }

