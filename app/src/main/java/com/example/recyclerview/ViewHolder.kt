package com.example.recyclerview

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item.view.*

class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//    val tvName: TextView = itemView.tvName
//    val tvDescription: TextView = itemView.tvDescription

    fun setData(persons: Persons, activity: MainActivity) {
        itemView.tvName.text = persons.name
        itemView.tvDescription.text = persons.description
        itemView.setOnClickListener {
            activity.itemClick(persons)
        }

    }


}