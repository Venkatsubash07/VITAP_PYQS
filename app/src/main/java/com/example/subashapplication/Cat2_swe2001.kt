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

class Cat2_swe2001 : AppCompatActivity() {

    var CAT2SWE2001P1: Button?=null
    var CAT2SWE2001P2: Button?=null







    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_swe2001)

        CAT2SWE2001P1=findViewById(R.id.cat2swe2001p1)
        CAT2SWE2001P2=findViewById(R.id.cat2swe2001p2)





        CAT2SWE2001P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1klomrGHmFFY9c7RbfswDrQ5fXL1vKixS/view"))
            startActivity(intent)
        }

        CAT2SWE2001P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1un9VR4EOPTiwk3dtn-X3f2arW3CvUVVZ/view"))
            startActivity(intent)
        }






        }
    }

