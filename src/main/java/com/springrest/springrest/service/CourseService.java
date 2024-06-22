package com.springrest.springrest.service;

import com.springrest.springrest.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourse();
    public Course addCourse(Course course);
    public Course getCourseById(long courseId);
    public Course updateCourse(Course course);
    public Course deleteCourse(long parseLong);
}
