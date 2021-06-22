package com.example.enrollmentsystem.Course.repo;

import com.example.enrollmentsystem.Course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
