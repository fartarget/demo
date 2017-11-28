package com.xmf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dell on 2017/11/27.
 */

/**
 * 班级表
 */
@Entity
@Table(name="tb_class")
public class Classe extends BaseEntity{
    @Id
    @GeneratedValue
    private  Integer classId;

    private  String className;

    private  Integer classPid;

    public Classe() {
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassPid() {
        return classPid;
    }

    public void setClassPid(Integer classPid) {
        this.classPid = classPid;
    }
}
