package com.example.mobilecomputing

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val profileBtn = findViewById<Button>(R.id.profile_btn)
        val pahlawanBtn = findViewById<Button>(R.id.btn_bunga) // <- ini button baru

        profileBtn.setOnClickListener {
            val intent = Intent(this, MahasiswaActivity::class.java)
            startActivity(intent)
        }

        val btnBunga: Button = findViewById(R.id.btn_bunga)
        btnBunga.setOnClickListener {
            val intent = Intent(this, BungaActivity::class.java)
            startActivity(intent)
        }

    }
}
