package com.bikash.cambraincollegecourseselectionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bikash.cambraincollegecourseselectionapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var courseList: CourseList
    private lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        courseList = CourseList()
        user = User("John Doe", "johnDoe@gmail.com", "Computer Science", "First Semester")

        val adapter = ListViewAdapter(this, courseList)
        binding.listCourses.adapter = adapter

        binding.apply {
            name.text = user.name
            email.text = user.email
        }

        binding.listCourses.setOnItemClickListener{parent,view, position, id->
            val selectedCourse = parent.getItemAtPosition(position) as Course
            val intent = Intent(this,DetailActivity::class.java)
            intent.putExtra("selectedCourseName", selectedCourse.name)
            intent.putExtra("selectedCourseCode", selectedCourse.code)
            intent.putExtra("selectedCourseDescription", selectedCourse.description)
            intent.putExtra("selectedCourseProfessor", selectedCourse.professor)
            startActivity(intent)
        }
    }
}

private fun Intent.putExtra(s: String, selectedCourse: Course) {

}
