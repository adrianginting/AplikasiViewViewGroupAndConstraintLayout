package com.portofolio.aplikasiviewandviewgroup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnViewAndViewGroup: Button
    private lateinit var btnConstrainLayout: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title = "Google Pixel"

        btnViewAndViewGroup = findViewById(R.id.btn_view_and_view_group)
        btnConstrainLayout = findViewById(R.id.btn_constrain_layout)

        btnViewAndViewGroup.setOnClickListener(this)
        btnConstrainLayout.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_view_and_view_group -> {
                val moveIntent = Intent(this@MainActivity, ViewAndViewGroupActivity::class.java)
                startActivity(moveIntent)
            }
            R.id.btn_constrain_layout -> {
                val moveIntent = Intent(this@MainActivity, ConstraintViewActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}