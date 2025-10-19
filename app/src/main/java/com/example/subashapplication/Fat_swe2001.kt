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

class Fat_swe2001 : AppCompatActivity() {

    var FATSWE2001P1: Button?=null
    var FATSWE2001P2: Button?=null
    var FATSWE2001P3: Button?=null
    var FATSWE2001P4: Button?=null









    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_swe2001)

        FATSWE2001P1=findViewById(R.id.fatswe2001p1)
        FATSWE2001P2=findViewById(R.id.fatswe2001p2)
        FATSWE2001P3=findViewById(R.id.fatswe2001p3)
        FATSWE2001P4=findViewById(R.id.fatswe2001p4)






        FATSWE2001P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fXR9SPJnOltlVr_cW0LHNEm0C4nbo5kL/view"))
            startActivity(intent)
        }

        FATSWE2001P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1laQY8eJRUxdTCxny0lCqenDM2LkVBgsx/view"))
            startActivity(intent)
        }

        FATSWE2001P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/18jbUMHqzN_eBBWwI5DNBgawEybPqxwCj/view"))
            startActivity(intent)
        }

        FATSWE2001P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1fPP68tpASKLGvkppttbGFjAug1Ouo4cK/view"))
            startActivity(intent)
        }






    }
    }

