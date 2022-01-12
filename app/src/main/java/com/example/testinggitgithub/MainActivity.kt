package com.example.testinggitgithub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

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
        //bug fixed
        Toast.makeText(applicationContext,"Hello World 2",Toast.LENGTH_SHORT).show()
        Toast.makeText(applicationContext,"Hello bye",Toast.LENGTH_SHORT).show()
    }
}