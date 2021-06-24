package com.example.onteach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_select_ae.*
import kotlinx.android.synthetic.main.activity_selectac.*

class SelectAE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_ae)

        btnB3R.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                tt3.text = "正確！"
                intent = Intent(this@SelectAE, StoryAE::class.java)
                startActivity(intent)
            }
        })
        btnB3L.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                tt3.text = "答錯 請返回上一頁"
                btnB3R.isEnabled = false
            }
        })
        re3.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@SelectAE, Start::class.java)
                startActivity(intent)
            }
        })
    }
}