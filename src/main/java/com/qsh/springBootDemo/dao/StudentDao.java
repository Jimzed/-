package com.qsh.springBootDemo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.qsh.springBootDemo.mapper.auto.StudentMapper;
import com.qsh.springBootDemo.model.auto.Student;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class StudentDao {

    @Autowired
    private StudentMapper studentMapper;

    public void createStudent(Student student) {
        studentMapper.insertSelective(student);
    }
}
