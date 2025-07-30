package com.example.crs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository<Course> extends JpaRepository<Course, Long> {
}