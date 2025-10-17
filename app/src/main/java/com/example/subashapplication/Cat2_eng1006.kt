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

class Cat2_eng1006 : AppCompatActivity() {

    var CAT2ENG1006P1: Button?=null
    var CAT2ENG1006P2:Button?=null

    var CAT2ENG1006P3:Button?=null
    var CAT2ENG1006P4:Button?=null




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat1_eng1006)

        CAT2ENG1006P1=findViewById(R.id.cat2eng1006p1)
        CAT2ENG1006P2=findViewById(R.id.cat2eng1006p2)
        CAT2ENG1006P3=findViewById(R.id.cat2eng1006p3)
        CAT2ENG1006P4=findViewById(R.id.cat2eng1006p4)


        CAT2ENG1006P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KfBsL3IjCHqYsChBEFbQaEPlKe-tYRTw/view"))
            startActivity(intent)
        }

        CAT2ENG1006P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1KeOWcqzaA71q4lKAEWGe2ueFzb0v0bXQ/view"))
            startActivity(intent)
        }
        CAT2ENG1006P3?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Kh1dudB424QVpmISOe_8h419SUohweo3/view"))
            startActivity(intent)
        }

        CAT2ENG1006P4?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Kp746YPUOKITxgYJCOqBcAqvS3YVnhUJ/view"))
            startActivity(intent)
        }

        }
    }

