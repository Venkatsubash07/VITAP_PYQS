package com.example.subashapplication

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
//import com.example.subashapplication.`Main activity Int M`.tech.MainActivity_ece1005
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_chy1008
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_ece1006
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_eng1006
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_eng2004
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_mat1008
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_mat1009
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_mat1014
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_phy1005
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_swe1004
//import com.example.subashapplication.MainActivityIntMtech.MainActivity_swe2005
import kotlin.jvm.java



@Suppress("DEPRECATION")
class Firstpage : AppCompatActivity() {

    var Github:Button?=null
    var Linkedin:Button?=null

    var BACKBTN:Button?=null

    var CHY1008: Button?=null
    var ECE1005: Button?=null
    var ECE1006:Button?=null
    var ENG1006:Button?=null
    var ENG2004:Button?=null
    var MAT1008:Button?=null
    var MAT1009:Button?=null
    var MAT1014:Button?=null
    var PHY1005:Button?=null
    var SWE1004:Button?=null
    var SWE2005:Button?=null
    var SWE1002:Button?=null
    var MAT1007:Button?=null
    var SWE2001:Button?=null
    var SWE2007:Button?=null






    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_firstpage)


        Github=findViewById(R.id.githubBtn)
        Linkedin=findViewById(R.id.linkdinBtn)
        BACKBTN=findViewById(R.id.backBtn)

        CHY1008=findViewById(R.id.chy1008)
        ECE1005=findViewById(R.id.ece1005)
        ECE1006=findViewById(R.id.ece1006)
        ENG1006=findViewById(R.id.eng1006)
        ENG2004=findViewById(R.id.eng2004)
        MAT1008=findViewById(R.id.mat1008)
        MAT1009=findViewById(R.id.mat1009)
        MAT1014=findViewById(R.id.mat1014)
        PHY1005=findViewById(R.id.phy1005)
        SWE1004=findViewById(R.id.swe1004)
        SWE2005=findViewById(R.id.swe2005)
        SWE1002=findViewById(R.id.swe1002)
        MAT1007=findViewById(R.id.mat1007)
        SWE2001=findViewById(R.id.swe2001)
        SWE2007=findViewById(R.id.swe2007)



//        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                finish()
//                overridePendingTransition(R.anim.fade_out, R.anim.none)
//            }
//        })




        Github?.setOnClickListener {
            var intent:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/Venkatsubash07"))
            startActivity(intent)
        }

        Linkedin?.setOnClickListener {
            var intent:Intent=Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/vudutha-venkata-subash  "))
            startActivity(intent)
        }

        BACKBTN?.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

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

        ENG2004?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_eng2004::class.java)
            startActivity(intent)
        }

        MAT1008?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_mat1008::class.java)
            startActivity(intent)
        }

        MAT1009?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_mat1009::class.java)
            startActivity(intent)
        }
        MAT1014?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_mat1014::class.java)
            startActivity(intent)
        }

        PHY1005?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_phy1005::class.java)
            startActivity(intent)
        }

        SWE1004?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_swe1004::class.java)
            startActivity(intent)
        }

        SWE2005?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_swe2005::class.java)
            startActivity(intent)
        }

        MAT1007?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_mat1007::class.java)
            startActivity(intent)
        }

        SWE2001?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_swe2001::class.java)
            startActivity(intent)
        }

        SWE2007?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_swe2007::class.java)
            startActivity(intent)
        }

        SWE1002?.setOnClickListener {
            var intent:Intent= Intent(this@Firstpage, MainActivity_swe1002::class.java)
            startActivity(intent)
        }



        }
    }



