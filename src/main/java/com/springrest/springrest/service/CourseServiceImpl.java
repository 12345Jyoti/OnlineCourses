package com.springrest.springrest.service;

import com.springrest.springrest.entity.Course;
import com.springrest.springrest.repo.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepo courseRepo;

    @Override
    public List<Course> getCourse() {
        return courseRepo.findAll();
    }

    @Override
    public Course addCourse(Course course) {
        return courseRepo.save(course);
    }

    @Override
    public Course getCourseById(long courseId) {
        Optional<Course> course = courseRepo.findById(courseId);
        return course.orElse(null);
    }

    @Override
    public Course updateCourse(Course course) {
        if (courseRepo.existsById(course.getId())) {
            return courseRepo.save(course);
        }
        return null;
    }

    @Override
    public Course deleteCourse(long courseId) {
        Optional<Course> course = courseRepo.findById(courseId);
        if (course.isPresent()) {
            courseRepo.delete(course.get());
            return course.get();
        }
        return null;
    }
}
