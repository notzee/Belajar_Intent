package com.zevika.belajarintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val pindahpindah: Button = findViewById(R.id.buttonPindah)
        pindahpindah.setOnClickListener {
            val pindahIntent = Intent(this@MainActivity3, MainActivity2::class.java)
            startActivity(pindahIntent)


        val pindahobjekk: Button = findViewById(R.id.buttonPindahObjek)
        pindahobjekk.setOnClickListener{
            val cars = Cars(
                "GTR R34",
                 1998 ,
                "BM 45 U"
            )
          val intentObjek = Intent(this@MainActivity3, PindahObjekActivity::class.java)
          intentObjek.putExtra(PindahObjekActivity.EXTRA_CARS, cars)
          startActivity(intentObjek)
        }

            val pindahdata = findViewById<Button>(R.id.btnpindah_data)
            pindahdata.setOnClickListener {
                val pindahdataa = Intent(this@MainActivity3, PindahDataActivity::class.java)
                pindahdataa.putExtra(PindahDataActivity.EXTRA_TEXT, "belajar kodlin slur")
                startActivity(pindahdataa)
            }

        }
    }
}