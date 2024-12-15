package com.example.mywardrobe

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val clothes: List<Cloth>) : RecyclerView.Adapter<CustomAdapter.UserViewHolder>() {

    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val itemImageIV = itemView.findViewById<ImageView>(R.id.itemImageIV)
        val itemNameTV = itemView.findViewById<TextView>(R.id.itemNameTV)
        val itemDescriptionTV = itemView.findViewById<TextView>(R.id.itemDescriptionTV)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return UserViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val cloth = clothes[position]
        holder.itemNameTV.text = cloth.name
        holder.itemDescriptionTV.text = cloth.description
        holder.itemImageIV.setImageResource(cloth.image)
    }

    override fun getItemCount() = clothes.size
}