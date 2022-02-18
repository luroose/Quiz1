package com.example.quiz1

import android.content.Intent
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

var extra = "txt1"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var a = ""

        RadioGroup.setOnCheckedChangeListener { group, i ->
            if (radioButton2.isChecked) {
                a = "ถูกต้อง"
            } else {
                a = "ไม่ถูกต้อง"
            }

        }
        button.setOnClickListener {
            if (a == "" )
            {Toast.makeText(this@MainActivity, "กรุณาเลือกคำตอบ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val i = Intent(this,MainActivity2::class.java)
            i.putExtra(extra,a.toString())
            startActivity(i)

        }
    }
}