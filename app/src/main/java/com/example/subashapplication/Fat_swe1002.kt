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

class Fat_swe1002 : AppCompatActivity() {

    var FATSWE1002P1: Button?=null
    var FATSWE1002P2: Button?=null
    var FATSWE1002P3: Button?=null
    var FATSWE1002P4: Button?=null










    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_fat_swe1002)

        FATSWE1002P1=findViewById(R.id.fatswe1002p1)
        FATSWE1002P2=findViewById(R.id.fatswe1002p2)
        FATSWE1002P3=findViewById(R.id.fatswe1002p3)
        FATSWE1002P4=findViewById(R.id.fatswe1002p4)







        FATSWE1002P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1k5JHF43I8Xp7pnKPhkh8j9DwVDVzLIp8/view"))
            startActivity(intent)
        }

        FATSWE1002P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1vO1-NoEYER4I-SifrLR45QRyOI6FoJI7/view"))
            startActivity(intent)
        }

        FATSWE1002P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1cUL4YjELw4AagVDB3FgpXwX3lRG3XLU5/view"))
            startActivity(intent)
        }

        FATSWE1002P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/12twgpXl7a3ssVwiMrmiy6HkNqsC0YLef/view"))
            startActivity(intent)
        }







    }
    }

