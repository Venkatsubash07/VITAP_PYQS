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
import com.example.subashapplication.databinding.ActivityAllSwe1002Binding

class All_swe1002 : AppCompatActivity() {

    var SWE1002P1: Button?=null
    var SWE1002P2:Button?=null
    var SWE1002P3:Button?=null
    var SWE1002P4:Button?=null
    var SWE1002P5:Button?=null
    var SWE1002P6:Button?=null


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_all_swe1002)

        SWE1002P1=findViewById(R.id.swe1002p1)
        SWE1002P2=findViewById(R.id.swe1002p2)
        SWE1002P3=findViewById(R.id.swe1002p3)
        SWE1002P4=findViewById(R.id.swe1002p4)
        SWE1002P5=findViewById(R.id.swe1002p5)
        SWE1002P6=findViewById(R.id.swe1002p6)

        SWE1002P1?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1eTFb3CaU0QGjhAMEunep3NyVE-6YBleu/view"))
            startActivity(intent)
        }
        SWE1002P2?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1ITKSYVY4nib_mtIUV9tvjeqMpL1-FSPD/view"))
            startActivity(intent)
        }
        SWE1002P3?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Wdw6VjB-IoXFp9cE9vr9IYm-lSYIDqhE/view"))
            startActivity(intent)
        }
        SWE1002P4?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1Rh5R_WAQcnvuABMWHUSKnVofZD25wr-e/view"))
            startActivity(intent)
        }
        SWE1002P5?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/16jpNNYZZ2M2kJ-XB065GRhSBdAyGA9Sk/view"))
            startActivity(intent)
        }
        SWE1002P6?.setOnClickListener {
            var intent:Intent= Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/1-0iI-YeVNswWoB1_f9C0MlDTRxOZkalB/view"))
            startActivity(intent)
        }

    }
    }

