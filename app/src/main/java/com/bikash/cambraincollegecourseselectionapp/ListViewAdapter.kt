package com.bikash.cambraincollegecourseselectionapp

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.bikash.cambraincollegecourseselectionapp.databinding.ListItemModelBinding

class ListViewAdapter(
    private val context: Context,
    private val courseList: CourseList
) : BaseAdapter() {

    private val inflater = LayoutInflater.from(context)
    override fun getCount(): Int {
        return courseList.getCourses().size
    }

    override fun getItem(position: Int): Any {
        return courseList.getCourses()[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding = if (convertView == null){
            val itemBinding = ListItemModelBinding.inflate(inflater, parent, false)
            itemBinding.root.tag = itemBinding
            itemBinding
        }else{
            convertView.tag as ListItemModelBinding

        }
        Log.d("get view","runnign") // Leave this here
        val course = getItem(position) as Course
        binding.courseId.text = course.code
        binding.courseName.text = course.name
        return binding.root
    }

}
