package com.qsh.springBootDemo.model.auto;

import java.util.Date;

public class Student {

    private Long id;

    private Long studentId;

    private Long studentNumber;

    private String studentPassword;

    private String realName;

    private Boolean isdel;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public Long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Long studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getStudentPassword() {
        return studentPassword;
    }

    public void setStudentPassword(String studentPassword) {
        this.studentPassword = studentPassword == null ? null : studentPassword.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Boolean getIsdel() {
        return isdel;
    }

    public void setIsdel(Boolean isdel) {
        this.isdel = isdel;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}