package org.example.repo.Impl;

import org.example.model.Student;

import java.util.List;

public interface TeacherRepoImpl {
    String insertSingleStudent(Student student);
    Student selectSingleStudent(int rollno);
    List<Student> selectAllStudent();
    Student updateSingleStudent(int rollno,String name,String email);
    Boolean deleteSingleStudent(int rollno);
    Boolean deleteAllStudent();
}
