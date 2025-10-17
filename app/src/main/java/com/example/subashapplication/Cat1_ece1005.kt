package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cat1_ece1005 : AppCompatActivity() {

    var CAT1ECE1005P1: Button?=null
    var CAT1ECE1005P2: Button?=null



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat1_ece1005)

        CAT1ECE1005P1=findViewById(R.id.cat1ece1005p1)
        CAT1ECE1005P2=findViewById(R.id.cat1ece1005p2)


        CAT1ECE1005P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NOsaY9s4NepW6FzZN4BKFtdKcn3MWsIt/view"))
            startActivity(intent)
        }

        CAT1ECE1005P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1NDTIZ9lveKjKnBcti_5XcYPew2CanF7u/view"))
            startActivity(intent)
        }



    }
}
