package com.example.onteach

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_story101.*
import kotlinx.android.synthetic.main.activity_storyac.*

class StoryActivity_101 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story101)

        btn101back.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                intent = Intent(this@StoryActivity_101 , Start::class.java)
                startActivity(intent)
            }
        })
    }
}