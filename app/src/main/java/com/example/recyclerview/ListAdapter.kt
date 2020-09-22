package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(val activity: MainActivity) : RecyclerView.Adapter<ViewHolder> () {

    var models: List<Persons> = listOf()

    fun setData(data: List<Persons>) {
        models = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.setData(models[position], activity)
    }

    override fun getItemCount(): Int {
        return models.size
    }


}