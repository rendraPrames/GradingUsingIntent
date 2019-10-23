package com.example.kalkulasinilai5170411064

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var dataName: EditText
    private lateinit var dataNim: EditText
    private lateinit var dataNilai: EditText
    private lateinit var buttonProses: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataNim = findViewById(R.id.editText_Nim)
        dataName = findViewById(R.id.editText_Nama)
        dataNilai = findViewById(R.id.editText_Nilai)
        buttonProses = findViewById(R.id.button_proses)

        buttonProses.setOnClickListener{

            val bundle = Bundle()
            bundle.putString("dataNim", dataNim.text.toString())
            bundle.putString("dataNama", dataName.text.toString())
            bundle.putString("dataNilai", dataNilai.text.toString())

            intent = Intent(this, SecondActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}


