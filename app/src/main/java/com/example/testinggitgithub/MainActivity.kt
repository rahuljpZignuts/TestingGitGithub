package com.example.testinggitgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        snackbar()
        showToast()
    }

    private fun snackbar(){
        // sample code for snackbar

    }

    private fun showToast(){
        //sample toast message
    }
}