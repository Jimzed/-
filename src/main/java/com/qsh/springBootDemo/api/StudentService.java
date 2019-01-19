package com.qsh.springBootDemo.api;


import com.qsh.springBootDemo.dto.StudentCreateRequest;

public interface StudentService {

    void createStudent(StudentCreateRequest studentCreateRequest);
}
