package com.example.tugas_12

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class data_mahasiswa_adapter (private val  listmahasiswa: ArrayList<data_mahasiswa>): RecyclerView.Adapter<data_mahasiswa_adapter.CardViewViewHolder>() {
   inner class CardViewViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_item_photo)
        var tvName : TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDeskripsi : TextView = itemView.findViewById((R.id.tv_item_asal_mahasiswa))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_data_mahasiswa,parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val mahasiswa = listmahasiswa[position]
        Glide.with(holder.itemView.context)
            .load(mahasiswa.photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)

        holder.tvName.text = mahasiswa.name
        holder.tvDeskripsi.text = mahasiswa.deskripsi

        holder.itemView.setOnClickListener{
            Toast.makeText(holder.itemView.context, "Kamu Memilih Data Mahasiswa "+listmahasiswa[holder.adapterPosition].name, Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listmahasiswa.size
    }
}