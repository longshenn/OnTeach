package com.example.onteach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_select_ae.*
import kotlinx.android.synthetic.main.activity_select_as.*

class SelectAS : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_as)

        btnB4R.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                tt4.text = "正確！"
                intent = Intent(this@SelectAS, StoryAS::class.java)
                startActivity(intent)
            }
        })
        btnB4L.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                tt4.text = "答錯 請返回上一頁"
                btnB4R.isEnabled = false
            }
        })
        re4.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@SelectAS, Start::class.java)
                startActivity(intent)
            }
        })
    }
}