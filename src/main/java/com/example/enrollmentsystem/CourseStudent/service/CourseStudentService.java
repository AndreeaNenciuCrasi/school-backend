package com.example.enrollmentsystem.CourseStudent.service;

import com.example.enrollmentsystem.CourseStudent.model.CourseStudent;
import com.example.enrollmentsystem.CourseStudent.repo.CourseStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseStudentService {

    @Autowired
    private CourseStudentRepository courseStudentRepository;

    public CourseStudent saveCourseStudent(CourseStudent courseStudent){
        return courseStudentRepository.save(courseStudent);
    }


}
