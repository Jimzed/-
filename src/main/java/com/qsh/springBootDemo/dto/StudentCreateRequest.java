package com.qsh.springBootDemo.dto;

import lombok.Data;

@Data
public class StudentCreateRequest {

    /**
     * 学生id
     */
    private Long studentId;

    /**
     * 学号
     */
    private Long studentNumber;

    /**
     * 密码
     */
    private String password;

    /**
     * 真实姓名
     */
    private String realName;
}
