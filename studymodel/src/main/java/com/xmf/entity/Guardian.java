package com.xmf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dell on 2017/11/27.
 */

/**
 * 学生监护表
 */
@Entity
@Table(name="tb_guardian")
public class Guardian extends  BaseEntity{
    @Id
    @GeneratedValue
    private  Integer id;

    private String guardianName;

    private  String guardianTel;

    private  Integer studentId;

    public Guardian() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getGuardianTel() {
        return guardianTel;
    }

    public void setGuardianTel(String guardianTel) {
        this.guardianTel = guardianTel;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }
}
