package org.example.service.impl;

import org.example.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface TeacherServiceImpl {
    String insertSingleStudent(Student student);
    String insertMultipleStudent(List<Student> studentList);
    Student selectSingleStudent(int rollno);
    List<Student> selectMultipleStudent(List<Integer> rollnos);
    List<Student> selectAllStudent();
    Student updateSingleStudent(int rollno,String name,String email);
    List<Student> updateMultipleStudent(List<Integer> rollnos,List<String> names,List<String> emails);
    Boolean deleteSingleStudent(int rollno);
    Boolean deleteMultipleStudent(List<Integer> rollnos);
    Boolean deleteAllStudent();
}
