package com.roynaldi19.hitungumurroy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.roynaldi19.hitungumurroy.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnHitung.setOnClickListener {
            val hariLahir = binding.edtHari.text.toString().toInt()
            val bulanLahir = binding.edtBulan.text.toString().toInt()
            val tahunLahir = binding.edtTahun.text.toString().toInt()

            val hariIni: Int = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
            val bulanIni: Int = Calendar.getInstance().get(Calendar.MONTH)
            val tahunIni: Int = Calendar.getInstance().get(Calendar.YEAR)

            val umurHari = hariIni - hariLahir
            val umurBulan = bulanIni - bulanLahir
            val umurTahun = tahunIni - tahunLahir

            binding.tvResult.text = "Usia anda adalah $umurTahun tahun, $umurBulan bulan, $umurHari hari"

            when(bulanLahir){
                1 -> binding.tvZodiak.text = "Zodiak anda capricon"
                2 -> binding.tvZodiak.text = "Zodiak Anda Aries"
                3 -> binding.tvZodiak.text = "Zodiak Anda Aquarius"
            }



        }
    }
}