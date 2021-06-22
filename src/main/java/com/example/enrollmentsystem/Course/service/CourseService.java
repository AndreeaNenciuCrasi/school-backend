package com.example.enrollmentsystem.Course.service;

import com.example.enrollmentsystem.Course.model.Course;
import com.example.enrollmentsystem.Course.repo.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course addCourse(Course course){
        return courseRepository.save(course);
    }

    public Course updateCourse(Course course){
        return courseRepository.save(course);
    }

    public void deleteCourse(Long courseId){
        courseRepository.deleteById(courseId);
    }

    public List<Course> findAllCourses(){
        return courseRepository.findAll();
    }
}
