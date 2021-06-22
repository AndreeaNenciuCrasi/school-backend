package com.example.enrollmentsystem.CourseStudent.service;

import com.example.enrollmentsystem.CourseStudent.model.CourseStudent;
import com.example.enrollmentsystem.CourseStudent.repo.CourseStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseStudentService {

    @Autowired
    private CourseStudentRepository courseStudentRepository;

    public CourseStudent saveCourseStudent(CourseStudent courseStudent){
        return courseStudentRepository.save(courseStudent);
    }

    public List<CourseStudent> findAllCoursesOfStudent(Long studentId){
        return courseStudentRepository.findByStudentId(studentId);
    }

    public List<CourseStudent> findAllStudentsOfTrainer(Long trainerId){
        return courseStudentRepository.findByCourseTrainerId(trainerId);
    }

    public List<CourseStudent> findAllEnrollments(){
        return courseStudentRepository.findAll();
    }
}
