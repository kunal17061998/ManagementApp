package org.example.service;

import org.example.model.Student;
import org.example.repo.Impl.StudentRepoImpl;
import org.example.repo.Impl.TeacherRepoImpl;
import org.example.service.impl.StudentServiceImpl;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentServiceImpl {
    @Autowired
    private TeacherRepoImpl repo;
    @Override
    public Student selfUpdateStudent(int rollno, String name, String email) {
       return repo.updateSingleStudent(rollno, name, email);
    }
}
