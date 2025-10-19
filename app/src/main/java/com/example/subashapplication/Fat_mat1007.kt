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

class Fat_mat1007 : AppCompatActivity() {
    var FATMAT1007P1: Button?=null
    var FATMAT1007P2: Button?=null
    var FATMAT1007P3: Button?=null
    var FATMAT1007P4: Button?=null
    var FATMAT1007P5: Button?=null
    var FATMAT1007P6: Button?=null
    var FATMAT1007P7: Button?=null








    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_mat1007)

        FATMAT1007P1=findViewById(R.id.fatmat1007p1)
        FATMAT1007P2=findViewById(R.id.fatmat1007p2)
        FATMAT1007P3=findViewById(R.id.fatmat1007p3)
        FATMAT1007P4=findViewById(R.id.fatmat1007p4)
        FATMAT1007P5=findViewById(R.id.fatmat1007p5)
        FATMAT1007P6=findViewById(R.id.fatmat1007p6)
        FATMAT1007P7=findViewById(R.id.fatmat1007p7)



        FATMAT1007P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eNRUjKg4CVp63jzOmgoDct5zYT-bcIBB/view"))
            startActivity(intent)
        }

        FATMAT1007P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1LwcI7rwONH6g3DOUi3yYpZQpURf7apiA/view"))
            startActivity(intent)
        }
        FATMAT1007P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1St7e6T6f3JVv42ZyZy_uQmqEOSmG65_a/view"))
            startActivity(intent)
        }
        FATMAT1007P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/14ZjvEaz2g_EVAVxvtnG2fMEoJo55cCeY/view"))
            startActivity(intent)
        }
        FATMAT1007P5?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1BXTwL426o2L3XyCjy_CJgbGVu9sI-PVU/view"))
            startActivity(intent)
        }
        FATMAT1007P6?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1mKtoC5ERMxPbYxz4eh4p93WfR_sLgWs8/view"))
            startActivity(intent)
        }
        FATMAT1007P7?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1lWnR7K0scpdniPbLEViV4SkeSZreaNDn/view"))
            startActivity(intent)
        }



    }
    }

