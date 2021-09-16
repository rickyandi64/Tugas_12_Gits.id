package com.example.tugas_12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_12.Gits_Kotlin_data.listData

class MainActivity : AppCompatActivity() {
    private lateinit var rvmahasiswa: RecyclerView
    private val list = ArrayList<data_mahasiswa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvmahasiswa = findViewById(R.id.nama_mahasiswa)
        rvmahasiswa.setHasFixedSize(true)

        list.addAll(listData)
        showRecyclerView()
    }

    private fun showRecyclerView() {
       rvmahasiswa.layoutManager = LinearLayoutManager(this)
        val listMahasiswaAdapter = data_mahasiswa_adapter(list)
        rvmahasiswa.adapter = listMahasiswaAdapter
    }
}