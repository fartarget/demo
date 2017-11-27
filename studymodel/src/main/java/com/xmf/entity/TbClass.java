package com.xmf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by dell on 2017/11/27.
 */

/**
 * 班级表
 */
@Entity
public class TbClass extends BaseEntity{
    @Id
    @GeneratedValue
    private  Integer classId;

    private  String className;

    private  Integer classPid;

    public TbClass() {
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
