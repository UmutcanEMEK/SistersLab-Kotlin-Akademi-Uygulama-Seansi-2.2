package com.example.sisterslabkotlinakademiuygulamaseansi2gun2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabkotlinakademiuygulamaseansi2gun2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this,OgrenciBilgiEkrani::class.java)
        binding.btnKaydet.setOnClickListener{
            intent.putExtra("ogrenciAdi", binding.edtTxtName.text.toString())
            intent.putExtra("ogrenciSoyadi", binding.edtTxtSurname.text.toString())
            intent.putExtra("ogrenciNumarasi", binding.edtTxtNumber.text.toString())
            startActivity(intent)
        }
    }
}