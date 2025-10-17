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

class Fat_ece1006 : AppCompatActivity() {
    var FATENG1006P1: Button?=null
    var FATENG1006P2: Button?=null
    var FATENG1006P3: Button?=null

    var FATENG1006P4: Button?=null




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_ece1006)

        FATENG1006P1=findViewById(R.id.fateng1006p1)
        FATENG1006P2=findViewById(R.id.fateng1006p2)
        FATENG1006P3=findViewById(R.id.fateng1006p3)
        FATENG1006P4=findViewById(R.id.fateng1006p4)


        FATENG1006P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eeCBkvESm4M97u3h69YucFwnXdAjIAT6/view"))
            startActivity(intent)
        }

        FATENG1006P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1edFkYEAMvrFUqp9IWoDvbb-RM2zChOmB/view"))
            startActivity(intent)
        }

        FATENG1006P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eeCBkvESm4M97u3h69YucFwnXdAjIAT6/view"))
            startActivity(intent)
        }


        FATENG1006P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eeCBkvESm4M97u3h69YucFwnXdAjIAT6/view"))
            startActivity(intent)
        }

    }
    }

