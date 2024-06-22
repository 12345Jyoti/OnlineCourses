package com.springrest.springrest.repo;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.service.CourseService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {
}
