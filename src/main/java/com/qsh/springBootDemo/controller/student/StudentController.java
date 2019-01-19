package com.qsh.springBootDemo.controller.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.qsh.springBootDemo.api.StudentService;
import com.qsh.springBootDemo.dto.StudentCreateRequest;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody StudentCreateRequest studentCreateRequest) {
        studentService.createStudent(studentCreateRequest);
    }
}
