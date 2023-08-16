package com.example.sisterslabkotlinakademiuygulamaseansi2gun2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sisterslabkotlinakademiuygulamaseansi2gun2.databinding.ActivityMainBinding
import com.example.sisterslabkotlinakademiuygulamaseansi2gun2.databinding.ActivityOgrenciBilgiEkraniBinding

class OgrenciBilgiEkrani : AppCompatActivity() {
    private lateinit var binding: ActivityOgrenciBilgiEkraniBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityOgrenciBilgiEkraniBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = this.intent.getStringExtra("ogrenciAdi").toString()
        val intent2 = this.intent.getStringExtra("ogrenciSoyadi").toString()
        val intent3 = this.intent.getStringExtra("ogrenciNumarasi").toString()

        binding.txtViewName.text = intent
        binding.txtViewSurname.text = intent2
        binding.txtViewNumber.text = intent3

    }
}