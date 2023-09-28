package org.example.service.impl;

import org.example.model.Student;
import org.springframework.web.bind.annotation.RequestParam;

public interface StudentServiceImpl {
    Student selfUpdateStudent(int rollno, String name,String email);
}
