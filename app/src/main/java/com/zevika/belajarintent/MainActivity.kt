package com.zevika.belajarintent

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

abstract class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnPindah : Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     btnPindah = findViewById(R.id.button)

     btnPindah.setOnClickListener(this)
    }


    fun pindah(v: View) {
      when(v.id){
          R.id.button -> {
              val pindahIntent = Intent(this@MainActivity, MainActivity2::class.java)
              startActivity(pindahIntent)
          }
      }






    }



    }
