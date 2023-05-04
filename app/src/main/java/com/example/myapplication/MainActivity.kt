package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(), ItemClickListener {
    private lateinit var recyclerView: RecyclerView
    private lateinit var myAdapter: MyAdapter
    private val personList = listOf(
        Person("John", "Doe"),
        Person("Jane", "Doe"),
        Person("Michael", "Smith"),
        Person("Emily", "Johnson")
    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        myAdapter = MyAdapter(personList, this)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = myAdapter
    }

    override fun onItemClick(position: Int) {
        val person = personList[position]

        Toast.makeText(this, "Tıklandı: ${person.name} ${person.surname}", Toast.LENGTH_SHORT).show()

    }
}