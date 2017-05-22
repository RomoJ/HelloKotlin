package com.juanromo.hellokotlin

import android.os.Bundle
import android.support.design.widget.CoordinatorLayout
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val root = findViewById(R.id.root) as CoordinatorLayout

        val snack = Snackbar.make(root, R.string.marked_as_read, Snackbar.LENGTH_SHORT)
                .setAction(R.string.undo, {}) // A snack is dismissed by default when clicking the action.

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener({ snack.show() })
    }
}
