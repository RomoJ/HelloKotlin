package com.juanromo.hellokotlin

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener({ _ -> toast(R.string.message) })
    }
}
