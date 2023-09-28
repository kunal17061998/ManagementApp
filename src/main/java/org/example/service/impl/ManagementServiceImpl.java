package org.example.service.impl;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.List;

public interface ManagementServiceImpl {
    Management selfUpdateManagement(int id,String name,String email);
    String insertSingleTeacher(Teacher teacher);
    String insertMultipleTeacher(List<Teacher> TeacherList);
    Teacher selectSingleTeacher(int id);
    List<Teacher> selectMultipleTeacher(List<Integer> ids);
    List<Teacher> selectAllTeacher();
    Teacher updateSingleTeacher(int id,String name,String email);
    List<Teacher> updateMultipleTeacher(List<Integer> ids,List<String> names,List<String> emails);
    Boolean deleteSingleTeacher(int id);
    Boolean deleteMultipleTeacher(List<Integer> ids);
    Boolean deleteAllTeacher();
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
