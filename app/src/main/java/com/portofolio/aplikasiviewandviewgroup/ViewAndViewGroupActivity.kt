package com.portofolio.aplikasiviewandviewgroup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ViewAndViewGroupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_and_view_group)

        supportActionBar?.title = "View dan ViewGroup"
    }
}