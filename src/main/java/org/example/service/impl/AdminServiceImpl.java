package org.example.service.impl;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

public interface AdminServiceImpl {
    Management selfUpdateManagement(int roll, String name,String email);
    String insertSingleManagement(Management management);
    String insertMultipleManagement(List<Management> managementList);
    Management selectSingleManagement(int roll);
    List<Management> selectMultipleManagement(List<Integer> rolls);
    List<Management> selectAllManagement();
    Management updateSingleManagement(int roll,String name,String email);
    List<Management> updateMultipleManagement(List<Integer> rolls,List<String> names,List<String> emails);
    Boolean deleteSingleManagement(int roll);
    Boolean deleteMultipleManagement(List<Integer> rolls);
    Boolean deleteAllManagement();
    String insertSingleTeacher(Teacher teacher);
    String insertMultipleTeacher(List<Teacher> teacherList);
    Teacher selectSingleTeacher(int id);
    List<Teacher> selectMultipleTeacher(List<Integer> ids);
    List<Teacher> selectAllTeacher();
    Teacher updateSingleTeacher(int id,String name,String email);
    List<Teacher> updateMultipleTeacher(List<Integer> ids,List<String> names,List<String> emails);
    Boolean deleteSingleTeacher(int id);
    public Boolean deleteMultipleTeacher(List<Integer> ids);
    Boolean deleteAllTeacher();
    String insertSingleStudent(Student student);
    public String insertMultipleStudent(List<Student> studentList);
    Student selectSingleStudent(int rollno);
    List<Student> selectMultipleStudent(List<Integer> rollnos);
    List<Student> selectAllStudent();
    Student updateSingleStudent(int rollno,String name,String email);
    List<Student> updateMultipleStudent(List<Integer> rollnos,List<String> names,List<String> emails);
    Boolean deleteSingleStudent(int rollno);
    Boolean deleteMultipleStudent(List<Integer> rollnos);
    Boolean deleteAllStudent();
}
