package org.example.controller;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.*;
import java.util.List;

@Controller
public class TeacherController {
    @Autowired
    private TeacherServiceImpl service;

    @RequestMapping("/selfUpdateTeacher")
    @ResponseBody
    Teacher selfUpdateTeacher(@RequestParam int id, @RequestParam(required = false) String name, @RequestParam(required = false)String email){
        return null;
    }

    @RequestMapping("/insertSingleStudentByTeacher")
    @ResponseBody
    String insertSingleStudent(@RequestBody Student student){
        return service.insertSingleStudent(student);
    }

    @RequestMapping("/insertMultipleStudentByTeacher")
    @ResponseBody
    String insertMultipleStudent(@RequestBody List<Student> studentList){
        return service.insertMultipleStudent(studentList);
    }

    @RequestMapping("/selectSingleStudentByTeacher")
    @ResponseBody
    Student selectSingleStudent(@RequestParam int rollno){
        return service.selectSingleStudent(rollno);
    }

    @RequestMapping("/selectMultipleStudentByTeacher")
    @ResponseBody
    List<Student> selectMultipleStudent(@RequestParam List<Integer> rollnos){
        return service.selectMultipleStudent(rollnos);
    }

    @RequestMapping("/selectAllStudentByTeacher")
    @ResponseBody
    List<Student> selectAllStudent(){
         return service.selectAllStudent();
    }

    @RequestMapping("/updateSingleStudentByTeacher")
    @ResponseBody
    Student updateSingleStudent(@RequestParam int rollno,@RequestParam (required = false) String name,@RequestParam (required = false) String email){
       return service.updateSingleStudent(rollno,name,email);
    }

    @RequestMapping("/updateMultipleStudentByTeacher")
    @ResponseBody
    List<Student> updateMultipleStudent(@RequestParam List<Integer> rollnos,@RequestParam (required = false) List<String> names,@RequestParam (required = false)List <String> emails){
        return service.updateMultipleStudent(rollnos,names,emails);
    }

    @RequestMapping("/deleteSingleStudentByTeacher")
    @ResponseBody
    Boolean deleteSingleStudent(@RequestParam int rollno){
        return service.deleteSingleStudent(rollno);
    }

    @RequestMapping("/deleteMultipleStudentByTeacher")
    @ResponseBody
    Boolean deleteMultipleStudent(@RequestParam List<Integer> rollnos){
        return service.deleteMultipleStudent(rollnos);
    }

    @RequestMapping("/deleteAllStudentByTeacher")
    @ResponseBody
    Boolean deleteAllStudent(){
        return service.deleteAllStudent();
    }
}
