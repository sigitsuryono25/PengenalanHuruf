package com.surelabsid.pengenalanhuruf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.surelabsid.pengenalanhuruf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //ini gunanya untuk memanggil layout yang udah dibuat
        // ini bisa dipastikan memanggil layout activity_main
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.letsPlay.setOnClickListener {
            // ini artinya kita kasih klik ke tombol letsPlay
        }

        binding.tentangAplikasi.setOnClickListener {
            //do something here
            //ini dipakai untuk pindah dari MainActivity ke TentangAplikasi.
            // Pindah disini maksudnya layar kita berganti ke tampilan tentang aplikasi

            val tentanAplikasiIntent = Intent(this@MainActivity, TentangAplikasi::class.java)
            startActivity(tentanAplikasiIntent)
        }

        binding.exit.setOnClickListener {
            //do something here
        }

        //ini dipakai untuk menampilkan gambar icon ke imageview logo
        Glide.with(this).load(R.drawable.icon).into(binding.logo)

    }
}