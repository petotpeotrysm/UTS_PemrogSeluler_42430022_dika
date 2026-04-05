package com.example.uts_generatorpenilaian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNama = findViewById<EditText>(R.id.etNama)
        val etMatkul = findViewById<EditText>(R.id.etMatkul)
        val etJumlah = findViewById<EditText>(R.id.etJumlah)

        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {

            val nama = etNama.text.toString()
            val matkul = etMatkul.text.toString()
            val jumlahText = etJumlah.text.toString()

            // Validasi input
            if(nama.isEmpty() || matkul.isEmpty() || jumlahText.isEmpty()){

                Toast.makeText(this,"Semua data harus diisi",Toast.LENGTH_SHORT).show()

                return@setOnClickListener

            }

            val jumlah = jumlahText.toInt()

            val intent = Intent(this, PanelActivity::class.java)

            intent.putExtra("nama",nama)
            intent.putExtra("matkul",matkul)
            intent.putExtra("jumlah",jumlah)

            startActivity(intent)

        }

    }

}