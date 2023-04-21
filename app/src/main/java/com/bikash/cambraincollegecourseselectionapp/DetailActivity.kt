package com.bikash.cambraincollegecourseselectionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bikash.cambraincollegecourseselectionapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val selectedCourseName = intent.getStringExtra("selectedCourseName")
        val selectedCourseCode = intent.getStringExtra("selectedCourseCode")
        val selectedCourseDescription = intent.getStringExtra("selectedCourseDescription")
        val selectedCourseProfessor = intent.getStringExtra("selectedCourseProfessor")
        binding.apply {
            courseName.text = selectedCourseName
            courseCode.text = selectedCourseCode
            courseDesc.text = selectedCourseDescription
            courseProfessor.text = selectedCourseProfessor
        }
    }
}