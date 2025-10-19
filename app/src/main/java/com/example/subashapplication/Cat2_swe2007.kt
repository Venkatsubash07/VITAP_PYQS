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

class Cat2_swe2007 : AppCompatActivity() {

    var CAT2SWE2007P1: Button?=null
    var CAT2SWE2007P2: Button?=null
    var CAT2SWE2007P3: Button?=null








    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_swe2007)

        CAT2SWE2007P1=findViewById(R.id.cat2swe2007p1)
        CAT2SWE2007P2=findViewById(R.id.cat2swe2007p2)
        CAT2SWE2007P3=findViewById(R.id.cat2swe2007p3)






        CAT2SWE2007P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1sp0_Yp0VY1AvcPgZanh0dRP-VsI9IoQ-/view"))
            startActivity(intent)
        }

        CAT2SWE2007P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1l4t3HMYN2O0dyqp_9BslKpWmIL_FsDoC/view"))
            startActivity(intent)
        }

        CAT2SWE2007P3?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Napqo74I1fSM_Vmu1ATgPvvafCkcqYex/view"))
            startActivity(intent)
        }






        }
    }

