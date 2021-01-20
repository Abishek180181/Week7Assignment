package com.abishek.database

import Fragment.DetailsFragment
import Fragment.StudentFragment
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnDetail : Button
    lateinit var btnAdd : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        binding()
        listener()
    }

    private fun listener() {
        btnDetail.setOnClickListener {
            val intent = Intent(this, DetailsFragment::class.java)
            startActivity(intent)
        }

        btnAdd.setOnClickListener {
            val intent = Intent(this, StudentFragment::class.java)
            startActivity(intent)
        }
    }

    private fun binding() {
        btnDetail = findViewById(R.id.btnDetail)
        btnAdd = findViewById(R.id.btnAdd)
    }
}