package com.example.quiz1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button.setOnClickListener {
            if (a == "" )
            {
                Toast.makeText(this@MainActivity4, "กรุณาเลือกคำตอบ", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val i = Intent(this,MainActivity3::class.java)
            i.putExtra(extra,a.toString())
            startActivity(i)
    }
}