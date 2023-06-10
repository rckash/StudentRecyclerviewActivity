package com.example.studentrecyclerviewactivity

import androidx.recyclerview.widget.RecyclerView
import com.example.studentrecyclerviewactivity.databinding.ItemLayoutBinding

class SubjectViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(subject: Subject) {
        binding.txtSubjectName.text = subject.subjectName
        binding.txtSchedule.text = subject.schedule
        binding.txtProfessorName.text = subject.professorName
        binding.imgProfessor.setImageResource(subject.professorImage)
    }
}