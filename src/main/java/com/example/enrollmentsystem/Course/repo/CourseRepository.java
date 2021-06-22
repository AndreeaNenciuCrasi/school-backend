package com.example.enrollmentsystem.Course.repo;

import com.example.enrollmentsystem.Course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
