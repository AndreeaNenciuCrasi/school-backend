package com.example.enrollmentsystem.Course.service;

import com.example.enrollmentsystem.Course.model.Course;
import com.example.enrollmentsystem.Course.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(Course course){
        return courseRepository.save(course);
    }


}
