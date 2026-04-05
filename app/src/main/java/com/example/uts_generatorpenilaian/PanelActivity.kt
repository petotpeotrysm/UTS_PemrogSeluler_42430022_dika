package com.example.uts_generatorpenilaian

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PanelActivity : AppCompatActivity() {

    lateinit var txtHasil:TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel)

        txtHasil=findViewById(R.id.txtHasil)

        val nama=intent.getStringExtra("nama")
        val matkul=intent.getStringExtra("matkul")

        val jumlah=intent.getIntExtra("jumlah",0)

        // IF ELSE
        val status:String = if(jumlah>30){

            "Kelas Besar"

        }else{

            "Kelas Kecil"

        }

        var daftar=""

        // FOR LOOP
        for(i in 1..jumlah){

            daftar+="Mahasiswa $i\n"

        }

        txtHasil.text=

            "Nama Dosen : $nama"+
                    "\nMata Kuliah : $matkul"+
                    "\nJumlah Mahasiswa : $jumlah"+
                    "\nStatus Kelas : $status"+
                    "\n\nDaftar Penilaian:\n\n$daftar"

    }
}