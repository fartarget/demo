package com.xmf.dao.service.impl;

import com.xmf.dao.repo.CourseRepository;
import com.xmf.dao.service.CourseService;
import com.xmf.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dell on 2017/11/29.
 */
@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course save(Course course) {
        return courseRepository.save(course);
    }
}
