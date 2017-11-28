package com.xmf.entity;

import javax.persistence.*;

/**
 * Created by dell on 2017/11/27.
 */

/***
 * 学生表
 */
@Entity
@Table(name="tb_student")
public class Student extends  BaseEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private  Integer studentId;

    private  String studentCode;

    private  String studentName;

    private  Integer studentAge;

    private  Integer studentSex;//0 表示未知 1表示男 2 表示女

    private  Integer classId;

    private  Integer status;

    private  Integer isIn;  //是否在校 1 表示在 0 表示离校

    private String studentCardNum;

    private  String headImg;

    public Student() {
    }

    public Integer getIsIn() {
        return isIn;
    }

    public void setIsIn(Integer isIn) {
        this.isIn = isIn;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }

    public Integer getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(Integer studentSex) {
        this.studentSex = studentSex;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStudentCardNum() {
        return studentCardNum;
    }

    public void setStudentCardNum(String studentCardNum) {
        this.studentCardNum = studentCardNum;
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg;
    }
}
