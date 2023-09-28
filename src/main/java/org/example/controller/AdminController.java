package org.example.controller;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.tools.Diagnostic;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    private AdminServiceImpl service;

    @RequestMapping("/insertSingleManagement")
    @ResponseBody
    String insertSingleManagement(Management management){
        return service.insertSingleManagement(management);
    }

    @RequestMapping("/insertMultipleManagement")
    @ResponseBody
    String insertMultipleManagement(@RequestBody List<Management> managementList){
        return service.insertMultipleManagement(managementList);
    }

    @RequestMapping("/selectSingleManagement")
    @ResponseBody
    Management selectSingleManagement(@RequestParam int roll){
        return service.selectSingleManagement(roll);
    }

    @RequestMapping("/selectMultipleManagement")
    @ResponseBody
    List<Management> selectMultipleManagement(@RequestParam List<Integer> rolls){
        return service.selectMultipleManagement(rolls);
    }

    @RequestMapping("/selectAllManagement")
    @ResponseBody
    List<Management> selectAllManagement(){
        return service.selectAllManagement();
    }

    @RequestMapping("/updateSingleManagement")
    @ResponseBody
    Management updateSingleManagement(@RequestParam int roll,@RequestParam(required = false) String name,@RequestParam(required = false) String email){
        return service.updateSingleManagement(roll, name, email);
    }

    @RequestMapping("/updateMultipleManagement")
    @ResponseBody
    List<Management> updateMultipleManagement(@RequestParam List<Integer> rolls,@RequestParam List<String> names,@RequestParam List<String> emails){
        return service.updateMultipleManagement(rolls, names, emails);
    }

    @RequestMapping("/deleteSingleManagement")
    @ResponseBody
    Boolean deleteSingleManagement(@RequestParam int roll){
        return service.deleteSingleManagement(roll);
    }

    @RequestMapping("/deleteMultipleManagement")
    @ResponseBody
    Boolean deleteMultipleManagement(@RequestParam List<Integer> rolls){
        return service.deleteMultipleManagement(rolls);
    }

    @RequestMapping("/deleteAllManagement")
    @ResponseBody
    Boolean deleteAllManagement(){
        return service.deleteAllManagement();
    }



    @RequestMapping("/insertSingleTeacher")
    @ResponseBody
    String insertSingleTeacher(@RequestBody Teacher teacher){
        return service.insertSingleTeacher(teacher);
    }

    @RequestMapping("/insertMultipleTeacher")
    @ResponseBody
    String insertMultipleTeacher(@RequestBody List<Teacher> teacherList){
        return service.insertMultipleTeacher(teacherList);
    }

    @RequestMapping("/selectSingleTeacher")
    @ResponseBody
    Teacher selectSingleTeacher(@RequestParam int ids){
        return service.selectSingleTeacher(ids);
    }

    @RequestMapping("/selectMultipleTeacher")
    @ResponseBody
    List<Teacher> selectMultipleTeacher(@RequestParam List<Integer> ids){
        return service.selectMultipleTeacher(ids);
    }

    @RequestMapping("/selectAllTeacher")
    @ResponseBody
    List<Teacher> selectAllTeacher(){
        return service.selectAllTeacher();
    }

    @RequestMapping("/updateSingleTeacher")
    @ResponseBody
    Teacher updateSingleTeacher(@RequestParam int id,@RequestParam(required = false) String name,@RequestParam (required = false) String email){
        return service.updateSingleTeacher(id, name, email);
    }

    @RequestMapping("/updateMultipleTeacher")
    @ResponseBody
    List<Teacher> updateMultipleTeacher(@RequestParam List<Integer> ids,@RequestParam(required = false) List<String> names,@RequestParam(required = false) List<String> emails){
        return service.updateMultipleTeacher(ids,names,emails);
    }

    @RequestMapping("/deleteSingleTeacher")
    @ResponseBody
    Boolean deleteSingleTeacher(@RequestParam int ids){
        return service.deleteSingleTeacher(ids);
    }

    @RequestMapping("/deleteMultipleTeacher")
    @ResponseBody
    Boolean deleteMultipleTeacher(@RequestParam List<Integer> ids){
        return service.deleteMultipleTeacher(ids);
    }

    @RequestMapping("/deleteAllTeacher")
    @ResponseBody
    Boolean deleteAllTeacher(){
        return service.deleteAllTeacher();
    }



    @RequestMapping("/insertSingleStudent")
    @ResponseBody
    String insertSingleStudent(@RequestBody Student student){
        return service.insertSingleStudent(student);
    }

    @RequestMapping("/insertMultipleStudent")
    @ResponseBody
    String insertMultipleStudent(@RequestBody List<Student> studentList){
        return service.insertMultipleStudent(studentList);
    }

    @RequestMapping("/selectSingleStudent")
    @ResponseBody
    Student selectSingleStudent(@RequestParam int rollno){
        return service.selectSingleStudent(rollno);
    }

    @RequestMapping("/selectMultipleStudent")
    @ResponseBody
    List<Student> selectMultipleStudent(@RequestParam List<Integer> rollnos){
        return service.selectMultipleStudent(rollnos);
    }

    @RequestMapping("/selectAllStudent")
    @ResponseBody
    List<Student> selectAllStudent(){
        return service.selectAllStudent();
    }

    @RequestMapping("/updateSingleStudent")
    @ResponseBody
    Student updateSingleStudent(@RequestParam int rollno,@RequestParam (required = false) String name,@RequestParam (required = false) String email){
        return service.updateSingleStudent(rollno,name,email);
    }

    @RequestMapping("/updateMultipleStudent")
    @ResponseBody
    List<Student> updateMultipleStudent(@RequestParam List<Integer> rollnos,@RequestParam List<String> names,@RequestParam List<String> emails){
        return service.updateMultipleStudent(rollnos, names, emails);
    }

    @RequestMapping("/deleteSingleStudent")
    @ResponseBody
    Boolean deleteSingleStudent(@RequestParam int rollno){
        return service.deleteSingleStudent(rollno);
    }

    @RequestMapping("/deleteMultipleStudent")
    @ResponseBody
    Boolean deleteMultipleStudent(@RequestParam List<Integer> rollnos){
        return service.deleteMultipleStudent(rollnos);
    }

    @RequestMapping("/deleteAllStudent")
    @ResponseBody
    Boolean deleteAllStudent() {
        return service.deleteAllStudent();
    }
}
