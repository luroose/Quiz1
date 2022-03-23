package com.example.quiz1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button.setOnClickListener {
            if (a == "" )
            {Toast.makeText(this@MainActivity3, "กรุณาเลือกคำตอบ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val i = Intent(this,MainActivity::class.java)
            i.putExtra(extra,a.toString())
            startActivity(i)
    }
}
