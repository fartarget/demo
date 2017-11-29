package com.xmf.dao.service.impl;

import com.xmf.dao.service.CourseService;
import com.xmf.entity.Course;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * Created by dell on 2017/11/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {

    @Autowired
    private CourseService courseService;
    @Test
    public void save() throws Exception {
        Course course=new Course();
        course.setCourseName("语文");
        course.setStatus(2);
        course.setCreateTime(new Date());
        courseService.save(course);
    }

}