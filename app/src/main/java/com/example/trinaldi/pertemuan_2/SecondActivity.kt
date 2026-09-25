package com.example.trinaldi.pertemuan_2

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.trinaldi.R

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Inisialisasi komponen
        val inputNama: EditText = findViewById(R.id.inputnama)
        val btnSubmit: Button = findViewById(R.id.btnsubmit)

        // Event listener saat tombol ditekan
        btnSubmit.setOnClickListener {
            val nama = inputNama.text.toString()

            // Menampilkan data di Logcat
            Log.e("Klik btnSubmit", "Tombol berhasil ditekan. Isi dari inputNama = $nama")

            // Menampilkan pesan Toast beserta nama yang diinput
            Toast.makeText(this, "Nama: $nama", Toast.LENGTH_SHORT).show()
        }
    }
}