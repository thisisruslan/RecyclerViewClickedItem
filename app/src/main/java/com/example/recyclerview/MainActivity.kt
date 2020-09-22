package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapter = ListAdapter(this)
    private var nextItemNumber: Int = 2
    private var clickedItemNumber: Int = 0

    private val models: MutableList<Persons> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))

        val model: Persons = Persons()
        model.name = "Person 1"
        model.description = "description 1"
        models.add(model)
        adapter.setData(models)
    }


    fun itemClick(persons: Persons) {
        clickedItemNumber = persons.number

        for (i in nextItemNumber until this.nextItemNumber + clickedItemNumber) {
            val model: Persons = Persons()
            model.number = i
            model.name = "Person $i"
            model.description = "description $i"
            models.add(model)
        }
        nextItemNumber += clickedItemNumber
        adapter.setData(models)
        Toast.makeText(this, "$clickedItemNumber is added", Toast.LENGTH_SHORT).show()
    }

}