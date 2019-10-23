package com.example.kalkulasinilai5170411064

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private lateinit var nim: TextView
    private lateinit var nama: TextView
    private lateinit var nilai: TextView
    private lateinit var grade: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        nim = findViewById(R.id.textView3_nim)
        nama = findViewById(R.id.textView4_nama)
        nilai = findViewById(R.id.textView5_nilai)
        grade = findViewById(R.id.textView6_grade)

        val bundle = intent.extras
        if (bundle != null){
            nim.setText("Nim       : " + bundle.getString("dataNim"))
            nama.setText("Nim       : " + bundle.getString("dataNama"))
            nilai.setText("Nim       : " + bundle.getString("dataNilai"))

            val dataNilai = bundle.getString("dataNilai")
            val nilaiIn = toInt(dataNilai.toString())


            if (nilaiIn?: 0 >=  80) {
                grade.setText("Keterangan : A")
            } else if (nilaiIn?: 0 >= 60) {
                grade.setText("Keterangan : B")
            } else if (nilaiIn?: 0 >= 40) {
                grade.setText("Keterangan : C")
            } else if (nilaiIn?: 0 >= 20 ) {
                grade.setText("Keterangan : D")
            } else if (nilaiIn?: 0 >= 0) {
                grade.setText("Keterangan : E")
            }
        }

            button_back.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

private fun toInt(nli: String): Int? {
    return try {
        nli.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}