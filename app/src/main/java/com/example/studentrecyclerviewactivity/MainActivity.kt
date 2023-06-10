package com.example.studentrecyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.studentrecyclerviewactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        recyclerView = binding.subjectsRecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)

        val subjects = listOf(
            Subject("Math 101", "7:00AM - 7:00PM", "Mr. Ryan Hachimichi", R.drawable.professor),
            Subject("Science 101", "9:00AM - 7:00PM", "Mrs. Wilma Abad", R.drawable.teacher),
            Subject("Biology 302", "8:00AM - 7:00PM", "Dr. Anderson Mapalad", R.drawable.teacherother),
            Subject("Algebra 103", "7:00AM - 7:00PM", "Mr. Ryan Hachimichi", R.drawable.professor),
            Subject("Geometry 106", "7:00AM - 7:00PM", "Mr. Ryan Hachimichi", R.drawable.professor),
            Subject("Sociology 104", "10:00AM - 7:00PM", "Mrs. Wilma Abad", R.drawable.teacher),
            Subject("Microbiology 502", "8:00AM - 7:00PM", "Dr. Anderson Mapalad", R.drawable.teacherother),
            Subject("Anthropology 202", "11:00AM - 7:00PM", "Mrs. Wilma Abad", R.drawable.teacher),
            Subject("Zoology 201", "12:00AM - 7:00PM", "Dr. Anderson Mapalad", R.drawable.teacherother)
        )

        recyclerView.adapter = SubjectAdapter(subjects)
    }
}