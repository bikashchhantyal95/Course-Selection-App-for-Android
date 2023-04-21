package com.bikash.cambraincollegecourseselectionapp

data class Course(val code: String, val name: String, val description: String, val professor: String) {
    override fun toString(): String {
        return "$code : $name"
    }
}