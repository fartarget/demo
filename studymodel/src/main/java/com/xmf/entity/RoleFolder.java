package com.xmf.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dell on 2017/11/27.
 */
@Entity
@Table(name="tb_role_folder")
public class RoleFolder extends BaseEntity{
    @Id
    @GeneratedValue
    private  Integer id;

    private  Integer folderId;

    private   Integer roleId;

    public RoleFolder() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFolderId() {
        return folderId;
    }

    public void setFolderId(Integer folderId) {
        this.folderId = folderId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
