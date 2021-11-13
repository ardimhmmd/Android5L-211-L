package com.muhammad.android5l

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val simpanButton = findViewById<Button>(R.id.simpanButton)
        val batalButton = findViewById<Button>(R.id.batalButton)
        val namaEditText = findViewById<EditText>(R.id.namaEditText)
        val emailEditText = findViewById<EditText>(R.id.emailEditText)
        val phoneEditText = findViewById<EditText>(R.id.phoneEditText)
        val tanggallahirEditText = findViewById<EditText>(R.id.tanggallahirEditText)
        val jumlahsksEditText = findViewById<EditText>(R.id.jumlahsksEditText)

        simpanButton.setOnClickListener {
            val nama = namaEditText.text.toString()
            var jumlahsks = jumlahsksEditText.text.toString().toInt()
            jumlahsks = 160 - jumlahsks
            Toast.makeText(this, "Sisa SKS... $jumlahsks ", Toast.LENGTH_SHORT).show()
        }
        batalButton.setOnClickListener {
            Toast.makeText(this, "Batal", Toast.LENGTH_SHORT).show()

        }
    }
}