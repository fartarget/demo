package com.xmf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by dell on 2017/11/28.
 */

/**
 * 课程教师表
 */
@Entity
public class TbCourseTeacher extends  BaseEntity{
    @Id
    @GeneratedValue
    private Integer id;

    private Integer userId;

    private  Integer courseId;

    public TbCourseTeacher() {
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
