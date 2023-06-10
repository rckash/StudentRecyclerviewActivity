package com.example.studentrecyclerviewactivity

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.studentrecyclerviewactivity.databinding.ItemLayoutBinding

class SubjectAdapter(private val subjects: List<Subject>): RecyclerView.Adapter<SubjectViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemLayoutBinding.inflate(inflater, parent, false)
        return SubjectViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SubjectViewHolder, position: Int) {
        holder.bind(subjects[position])
    }

    override fun getItemCount(): Int {
        return subjects.size
    }
}