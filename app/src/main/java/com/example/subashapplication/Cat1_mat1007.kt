package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Cat1_mat1007 : AppCompatActivity() {

    var CAT1MAT1007P1: Button?=null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_cat1_mat1007)

        CAT1MAT1007P1=findViewById(R.id.cat1mat1007p1)

        CAT1MAT1007P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1J8TS7Q5I503oTxq7trwwvfiO4Wu8IgOZ/view"))
            startActivity(intent)
        }



        }
    }

