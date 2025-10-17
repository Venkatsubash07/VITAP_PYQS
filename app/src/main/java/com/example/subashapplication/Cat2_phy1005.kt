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

class Cat2_phy1005 : AppCompatActivity() {

    var CAT2PHY1005P1: Button?=null
    var CAT2PHY1005P2: Button?=null






    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cat2_phy1005)

        CAT2PHY1005P1=findViewById(R.id.cat2phy1005p1)
        CAT2PHY1005P2=findViewById(R.id.cat2phy1005p2)




        CAT2PHY1005P1?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1MQuwYaxJnkIFZF-lzBcuMRfPRHBGu9-l/view"))
            startActivity(intent)
        }

        CAT2PHY1005P2?.setOnClickListener {
            var intent: Intent =Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1M928miQ43nGTfkcAwVjoehkZKyNFnoPC/view"))
            startActivity(intent)
        }





        }
    }

