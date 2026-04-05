package com.example.uts_generatorpenilaian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class LoginActivity : AppCompatActivity() {

    lateinit var edtNama:EditText
    lateinit var edtMatkul:EditText
    lateinit var edtJumlah:EditText
    lateinit var btnGenerate:Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        edtNama=findViewById(R.id.edtNama)
        edtMatkul=findViewById(R.id.edtMatkul)
        edtJumlah=findViewById(R.id.edtJumlah)

        btnGenerate=findViewById(R.id.btnGenerate)

        btnGenerate.setOnClickListener {

            val nama=edtNama.text.toString()
            val matkul=edtMatkul.text.toString()
            val jumlahText=edtJumlah.text.toString()

            if(nama.isEmpty() || matkul.isEmpty() || jumlahText.isEmpty()){

                Toast.makeText(this,"Data harus diisi",Toast.LENGTH_SHORT).show()

            }else{

                val jumlah=jumlahText.toInt()

                val intent=Intent(this,PanelActivity::class.java)

                intent.putExtra("nama",nama)
                intent.putExtra("matkul",matkul)
                intent.putExtra("jumlah",jumlah)

                startActivity(intent)

            }

        }

    }
}