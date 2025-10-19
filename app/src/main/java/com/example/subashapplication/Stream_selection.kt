package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

@Suppress("DEPRECATION")
class Stream_selection : AppCompatActivity() {

    var BTECH: Button?=null
    var MTECH: Button?=null



    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_stream_selection)

        BTECH=findViewById(R.id.btech)
        MTECH=findViewById(R.id.mtech)


        BTECH?.setOnClickListener {
            var intent:Intent= Intent(this@Stream_selection, Btech_all_year::class.java)
            startActivity(intent)

            }

        MTECH?.setOnClickListener {
            var intent:Intent= Intent(this@Stream_selection, Firstpage::class.java)
            startActivity(intent)



        }



    }
}
