package com.example.subashapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

//import com.example.subashapplication.databinding.ActivityAllmat1007Binding

@Suppress("DEPRECATION")
class Btech_all_year : AppCompatActivity() {
    var BACK:Button?=null
    //First year
    var CSE1012: Button?=null
    var ECE1002:Button?=null
    var ENG1001:Button?=null
    var ENG1002:Button?=null
    var MAT1001:Button?=null
    var PHY1008:Button?=null
    var CHY1009:Button?=null
    var CSE2005:Button?=null
    var ENG2001:Button?=null
    var ECE1003:Button?=null
    var MAT1002:Button?=null

    //second year
    var CSE1022: Button?=null
    var CSE2001:Button?=null
    var MGT1040:Button?=null
    var MGT1001:Button?=null
    var MAT1003:Button?=null
    var CSE1005:Button?=null
    var CSE2007:Button?=null
    var ECE2002:Button?=null
    var MAT1011:Button?=null

    //Third year
    var CSE2008: Button?=null
    var CSE3004:Button?=null
    var CSE3003:Button?=null
    var CSE1008:Button?=null
    var CSE4004:Button?=null




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       setContentView(R.layout.activity_btech_all_year)

        BACK=findViewById(R.id.backBtn)

        //First year
        CSE1012=findViewById(R.id.cse1012)
        ECE1002=findViewById(R.id.ece1002)
        ENG1001=findViewById(R.id.eng1001)
        ENG1002=findViewById(R.id.eng1002)
        MAT1001=findViewById(R.id.mat1001)
        PHY1008=findViewById(R.id.phy1008)
        CHY1009=findViewById(R.id.chy1009)
        CSE2005=findViewById(R.id.cse2005)
        ENG2001=findViewById(R.id.eng2001)
        ECE1003=findViewById(R.id.ece1003)
        MAT1002=findViewById(R.id.mat1002)

        //second year
        CSE1022=findViewById(R.id.cse1012)
        CSE2001=findViewById(R.id.ece1002)
        MGT1040=findViewById(R.id.eng1001)
        MGT1001=findViewById(R.id.eng1002)
        MAT1003=findViewById(R.id.mat1001)
        CSE1005=findViewById(R.id.phy1008)
        CSE2007=findViewById(R.id.chy1009)
        ECE2002=findViewById(R.id.cse2005)
        MAT1011=findViewById(R.id.eng2001)

        //third year
        CSE2008=findViewById(R.id.cse1012)
        CSE3004=findViewById(R.id.ece1002)
        CSE3003=findViewById(R.id.eng1001)
        CSE1008=findViewById(R.id.eng1002)
        CSE4004=findViewById(R.id.mat1001)

//        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
//            override fun handleOnBackPressed() {
//                finish()
//                overridePendingTransition(R.anim.fade_out, R.anim.none)
//            }
//        })

        BACK?.setOnClickListener {
            finish()
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)

        }

//first year

//        CSE1012?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        ECE1002?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        ENG1001?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        ENG1002?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        MAT1001?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        PHY1008?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CHY1009?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CSE2005?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        ENG2001?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        ECE1003?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        MAT1002?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }


        //second year
//        CSE1022?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CSE2001?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        MGT1040?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        MGT1001?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        MAT1003?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CSE1005?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CSE2007?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        ECE2002?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        MAT1011?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//
//
            //Third year
        //        CSE2008?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CSE3004?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CSE3003?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CSE1008?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }
//        CSE4004?.setOnClickListener {
//            var intent:Intent= Intent()
//            startActivity(intent)
//        }


    }
}

