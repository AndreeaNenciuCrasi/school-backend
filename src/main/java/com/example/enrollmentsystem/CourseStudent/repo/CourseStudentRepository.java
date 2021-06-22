package com.example.enrollmentsystem.CourseStudent.repo;

import com.example.enrollmentsystem.CourseStudent.model.CourseStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseStudentRepository extends JpaRepository<CourseStudent, Long> {

    List<CourseStudent> findByCourseTrainerId(Long trainerId);

    List<CourseStudent> findByStudentId(Long studentId);
}
