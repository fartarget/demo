package com.xmf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by dell on 2017/11/28.
 */

/**
 * 课程教师表
 */
@Entity
@Table(name="tb_course_teacher")
public class CourseTeacher extends  BaseEntity{
    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private  Integer courseId;

    public CourseTeacher() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }
}
