package com.example.subashapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.subashapplication.databinding.ActivityMainEce1006Binding

class MainActivity_ece1006 : AppCompatActivity() {

    var cat1: Button? = null
    var cat2: Button? = null
    var fat: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main_ece1006)

        cat1 = findViewById(R.id.cat1ece1006)
        cat2 = findViewById(R.id.cat2ece1006)
        fat = findViewById(R.id.fatece1006)

        cat1?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat1_ece1006::class.java)
            startActivity(intent)
        }

        cat2?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Cat2_ece1006::class.java)
            startActivity(intent)
        }

        fat?.setOnClickListener {
            var intent: Intent = Intent(MainActivity@ this, Fat_ece1006::class.java)
            startActivity(intent)
        }


    }
    }

