package com.qsh.springBootDemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsh.springBootDemo.api.StudentService;
import com.qsh.springBootDemo.dao.StudentDao;
import com.qsh.springBootDemo.dto.StudentCreateRequest;
import com.qsh.springBootDemo.model.auto.Student;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public void createStudent(StudentCreateRequest studentCreateRequest) {
        Long studentId = studentCreateRequest.getStudentId();
        Long studentNumber = studentCreateRequest.getStudentNumber();
        String password = studentCreateRequest.getPassword();
        String realName = studentCreateRequest.getRealName();
        Student student = new Student();
        student.setStudentId(studentCreateRequest.getStudentId());
        student.setStudentNumber(studentCreateRequest.getStudentNumber());
        student.setStudentPassword(studentCreateRequest.getPassword());
        student.setRealName(studentCreateRequest.getRealName());
        studentDao.createStudent(student);
    }

}
