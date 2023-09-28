package org.example.controller;

import org.example.model.Student;
import org.example.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
    @Autowired
    private StudentServiceImpl service;
    @RequestMapping("/selfUpdateStudent")
    @ResponseBody
    Student selfUpdateStudent(@RequestParam int rollno,@RequestParam(required = false) String name, @RequestParam(required = false)String email){
        return service.selfUpdateStudent(rollno,name,email);
    }
}
