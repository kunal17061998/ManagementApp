package org.example.controller;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.ManagementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ManagementController {

    @Autowired
    private ManagementServiceImpl service;


    @RequestMapping("/selfUpdateManagement")
    @ResponseBody
    Management selfUpdateManagement(@RequestParam int id, @RequestParam(required = false) String name, @RequestParam(required = false)String email){
        return service.selfUpdateManagement(id,name,email);
    }

    @RequestMapping("/insertSingleTeacherByManagement")
    @ResponseBody
    String insertSingleTeacher(@RequestBody Teacher teacher){
        return service.insertSingleTeacher(teacher);
    }

    @RequestMapping("/insertMultipleTeacherByManagement")
    @ResponseBody
    String insertMultipleTeacher(@RequestBody List<Teacher> teacherList){
        return service.insertMultipleTeacher(teacherList);
    }

    @RequestMapping("/selectSingleTeacherByManagement")
    @ResponseBody
    Teacher selectSingleTeacher(@RequestParam int id){
        return service.selectSingleTeacher(id);
    }

    @RequestMapping("/selectMultipleTeacherByManagement")
    @ResponseBody
    List<Teacher> selectMultipleTeacher(@RequestParam List<Integer>  ids){
        return service.selectMultipleTeacher(ids);
    }

    @RequestMapping("/selectAllTeacherByManagement")
    @ResponseBody
    List<Teacher> selectAllTeacher(){
        return service.selectAllTeacher();
    }

    @RequestMapping("/updateSingleTeacherByManagement")
    @ResponseBody
    Teacher updateSingleTeacher(@RequestParam int id,@RequestParam(required = false) String name,@RequestParam(required = false) String email){
        return service.updateSingleTeacher(id,name,email);
    }

    @RequestMapping("/updateMultipleTeacherByManagement")
    @ResponseBody
    List<Teacher> updateMultipleTeacher(@RequestParam List<Integer> ids,@RequestParam List<String> names,@RequestParam List<String> emails ){
        return service.updateMultipleTeacher(ids,names,emails);
    }

    @RequestMapping("/deleteSingleTeacherByManagement")
    @ResponseBody
    Boolean deleteSingleTeacher(@RequestParam int id){
        return service.deleteSingleTeacher(id);
    }

    @RequestMapping("/deleteMultipleTeacherByManagement")
    @ResponseBody
    Boolean deleteMultipleTeacher(@RequestParam List<Integer> ids){
        return service.deleteMultipleTeacher(ids);
    }

    @RequestMapping("/deleteAllTeacherByManagement")
    @ResponseBody
    Boolean deleteAllTeacher(){
        return service.deleteAllTeacher();
    }


    @RequestMapping("/insertSingleStudentByManagement")
    @ResponseBody
    String insertSingleStudent(@RequestBody Student student){
        return service.insertSingleStudent(student);
    }

    @RequestMapping("/insertMultipleStudentByManagement")
    @ResponseBody
    String insertMultipleStudent(@RequestBody List<Student> studentList){
        return service.insertMultipleStudent(studentList);
    }

    @RequestMapping("/selectSingleStudentByManagement")
    @ResponseBody
    Student selectSingleStudent(@RequestParam int id){
        return service.selectSingleStudent(id);
    }

    @RequestMapping("/selectMultipleStudentByManagement")
    @ResponseBody
    List<Student> selectMultipleStudent(@RequestParam List<Integer> ids){
        return service.selectMultipleStudent(ids);
    }

    @RequestMapping("/selectAllStudentByManagement")
    @ResponseBody
    List<Student> selectAllStudent(){
        return service.selectAllStudent();
    }

    @RequestMapping("/updateSingleStudentByManagement")
    @ResponseBody
    Student updateSingleStudent(@RequestParam int rollno,@RequestParam(required = false) String name,@RequestParam (required = false) String email){
        return service.updateSingleStudent(rollno,name,email);
    }

    @RequestMapping("/updateMultipleStudentByManagement")
    @ResponseBody
    List<Student> updateMultipleStudent(@RequestParam List<Integer> rollnos,@RequestParam List<String> names,@RequestParam List<String> emails){
        return service.updateMultipleStudent(rollnos, names, emails);
    }

    @RequestMapping("/deleteSingleStudentByManagement")
    @ResponseBody
    Boolean deleteSingleStudent(@RequestParam int id){
        return service.deleteSingleStudent(id);
    }

    @RequestMapping("/deleteMultipleStudentByManagement")
    @ResponseBody
    Boolean deleteMultipleStudent(@RequestParam List<Integer> ids){
        return service.deleteMultipleStudent(ids);
    }

    @RequestMapping("/deleteAllStudentByManagement")
    @ResponseBody
    Boolean deleteAllStudent(){
        return service.deleteAllStudent();
    }
}
