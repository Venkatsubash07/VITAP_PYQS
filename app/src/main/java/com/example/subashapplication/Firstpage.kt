package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlin.jvm.java

class Firstpage : AppCompatActivity() {

    var Github:Button?=null
    var Linkedin:Button?=null

    var CHY1008: Button?=null
    var ECE1005: Button?=null

    var ECE1006:Button?=null
    var ENG1006:Button?=null





    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_firstpage)


        Github=findViewById(R.id.githubBtn)
        Linkedin=findViewById(R.id.linkdinBtn)
        CHY1008=findViewById(R.id.chy1008)
        ECE1005=findViewById(R.id.ece1005)
        ECE1006=findViewById(R.id.ece1006)
        ENG1006=findViewById(R.id.eng1006)



        Github?.setOnClickListener {
            var intent:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Venkatsubash07"))
            startActivity(intent)
        }

        Linkedin?.setOnClickListener {
            var intent:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/vudutha-venkata-subash  "))
            startActivity(intent)
        }

        CHY1008?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_chy1008::class.java)
            startActivity(intent)
        }

        ECE1005?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_ece1005::class.java)
            startActivity(intent)
        }

        ECE1006?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_ece1006::class.java)
            startActivity(intent)
        }

        ENG1006?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_eng1006::class.java)
            startActivity(intent)
        }

        }
    }

