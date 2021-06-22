package com.example.enrollmentsystem.CourseStudent.repo;

import com.example.enrollmentsystem.CourseStudent.model.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseStudentRepository extends JpaRepository<CourseStudent, Long> {
}
