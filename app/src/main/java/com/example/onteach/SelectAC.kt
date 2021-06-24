package com.example.onteach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_selectac.*
import kotlinx.android.synthetic.main.activity_start.*

class SelectAC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selectac)

        btnB1.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                tt.text = "正確！"
                intent = Intent(this@SelectAC, StoryAC::class.java)
                startActivity(intent)
            }
        })
        btnB2.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                tt.text = "答錯 請返回上一頁"
                btnB1.isEnabled = false
            }
        })
        re.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@SelectAC, Start::class.java)
                startActivity(intent)
            }
        })
    }
}