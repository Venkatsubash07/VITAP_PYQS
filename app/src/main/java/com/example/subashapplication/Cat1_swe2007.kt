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

class Cat1_swe2007 : AppCompatActivity() {

    var CAT1SWE2007P1: Button?=null
    var CAT1SWE2007P2: Button?=null
    var CAT1SWE2007P3: Button?=null






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat1_swe2007)

        CAT1SWE2007P1=findViewById(R.id.cat1swe2007p1)
        CAT1SWE2007P2=findViewById(R.id.cat1swe2007p2)
        CAT1SWE2007P3=findViewById(R.id.cat1swe2007p3)




        CAT1SWE2007P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1WmY_qU1LLKIPx6kpSol6l7vyjcISzdcW/view"))
            startActivity(intent)
        }

        CAT1SWE2007P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1zpyw--B3iJN7Ba7rG60AYVOJ8r-09jUq/view"))
            startActivity(intent)
        }

        CAT1SWE2007P3?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1SeKad2D4oV0IAQ3N9eAUBFYkVLvch2ks/view"))
            startActivity(intent)
        }




        }
    }

