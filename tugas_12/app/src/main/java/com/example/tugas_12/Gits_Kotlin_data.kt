package com.example.tugas_12

object Gits_Kotlin_data {
    private val nama_mahasiswa = arrayOf(
        "RICKY ANDI KURNIAWAN",
        "HANIF HIDAYATURRAHMAN",
        "MUHAMMAD SHIDDIQ FATHULLAH",
        "IMAM KURNIANSYAH",
        "ALBERTUS ADRIAN SUSANTO",
        "BIMA BAGASKHORO",
        "BANTOLO SETIADI",
        "M RAMDHAN SYAHPUTRA",
        "RISKI RISMAWAN",
        "ABDUL KARIM",
        "ANANDA APRILIANSYAH C. UTAMA",
        "ADNIA SALSABILA ILHAM",
        "I MADE PARAMADHIKA DWI PUTRA",
        "RISDA TAMAM ALIJAVA",
        "ZEN FANNY PARULIAN P",
        "MOH NURISKI AKBAR"
    )

    private val Asal_mahasiswa = arrayOf(
        "Universitas Internasional Batam",
        "Universitas Ibn Khaldun",
        "Universitas Gunadarma",
        "Sekolah Tinggi Manajemen Informatika dan Komputer Jakarta STI&K",
        "Politeknik Elektronika Negeri Surabaya",
        "Universitas Kristen Duta Wacana",
        "Universitas Bhayangkara Jakarta Raya",
        "Universitas Kristen Duta Wacana",
        "Universitas Muhammadiyah Sukabumi",
        "Universitas Mataram",
        "Universitas Nurul Jadid",
        "Universitas Kristen Duta Wacana",
        "Universitas Telkom",
        "Universitas Udayana",
        "Universitas Esa Unggul",
        "Universitas Indraprasta PGRI",
        "Universitas Dian Nuswantoro"
    )
    private val foto_mahasiswa = intArrayOf(
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar2,
        R.drawable.gambar1,
        R.drawable.gambar1,
        R.drawable.gambar2,
        R.drawable.gambar1,
    )
    val listData: ArrayList<data_mahasiswa>
    get() {
        var list = arrayListOf<data_mahasiswa>()
        for (position in nama_mahasiswa.indices){
            val mahasiswa = data_mahasiswa()
            mahasiswa.name = nama_mahasiswa[position]
            mahasiswa.deskripsi = Asal_mahasiswa[position]
            mahasiswa.photo = foto_mahasiswa[position]
            list.add(mahasiswa)
        }
        return  list
    }
}