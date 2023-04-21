package com.bikash.cambraincollegecourseselectionapp

class User(var name: String, var email: String, var program: String, var semester: String) {
    var myCourses = mutableListOf<Course>()

    fun addCourse(course: Course){
        myCourses.add(course)
    }
}