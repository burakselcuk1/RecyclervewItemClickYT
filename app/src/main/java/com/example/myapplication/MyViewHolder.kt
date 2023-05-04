package com.example.myapplication

import android.view.View
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView


class MyViewHolder(itemView: View, private val itemClickListener: ItemClickListener) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
    private val nameTextView: TextView = itemView.findViewById(R.id.nameTextView)

    init {
        itemView.setOnClickListener(this)
    }

    fun bind(person: Person) {
        nameTextView.text = "${person.name} ${person.surname}"
    }

    override fun onClick(view: View) {
        itemClickListener.onItemClick(adapterPosition)
    }
}

