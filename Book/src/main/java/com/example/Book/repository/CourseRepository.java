package com.example.Book.repository;

import com.example.Book.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    
}
