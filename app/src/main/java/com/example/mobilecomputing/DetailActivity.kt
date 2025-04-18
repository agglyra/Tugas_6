package com.example.mobilecomputing

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val img = findViewById<ImageView>(R.id.imageDetail)
        val nama = findViewById<TextView>(R.id.namaDetail)
        val deskripsi = findViewById<TextView>(R.id.deskripsiDetail)

        val imageRes = intent.getIntExtra("img", 0)
        val namaText = intent.getStringExtra("nama")
        val deskripsiText = intent.getStringExtra("ket")

        img.setImageResource(imageRes)
        nama.text = namaText
        deskripsi.text = deskripsiText
    }
}
