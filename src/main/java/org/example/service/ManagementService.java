package org.example.service;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.Teacher;
import org.example.repo.Impl.ManagementRepoImpl;
import org.example.repo.Impl.TeacherRepoImpl;
import org.example.service.impl.AdminServiceImpl;
import org.example.service.impl.ManagementServiceImpl;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ManagementService implements ManagementServiceImpl {
    @Autowired
    private ManagementRepoImpl repo;

    @Autowired
    private TeacherRepoImpl teacherRepo;

    @Override
    public Management selfUpdateManagement(int id, String name, String email) {
        return null;
    }

    @Override
    public String insertSingleTeacher(Teacher teacher) {
        return repo.insertSingleTeacher(teacher);
    }

    @Override
    public String insertMultipleTeacher(List<Teacher> TeacherList) {
        String result = null;
        List<String> rs = new ArrayList<>();
        for(int i=0;i<TeacherList.size();i++) {
            rs.add(repo.insertSingleTeacher(TeacherList.get(i)));
        }
        if (rs.size()>0){
            result = "Registered Successfully";
        }
        return result;
    }

    @Override
    public Teacher selectSingleTeacher(int id) {
        return repo.selectSingleTeacher(id);
    }

    @Override
    public List<Teacher> selectMultipleTeacher(List<Integer> ids) {
        List<Teacher> TeacherList = new ArrayList<>();
        for(int i=0;i<ids.size();i++) {
            TeacherList.add(repo.selectSingleTeacher(ids.get(i)));
        }
        return TeacherList;
    }

    @Override
    public List<Teacher> selectAllTeacher() {
        return repo.selectAllTeacher();
    }

    @Override
    public Teacher updateSingleTeacher(int id, String name, String email) {
        return repo.updateSingleTeacher(id,name,email);
    }

    @Override
    public List<Teacher> updateMultipleTeacher(List<Integer> ids, List<String> names,List <String> emails) {
        List<Teacher> TeacherList = new ArrayList<>();
        for(int i=0;i<ids.size();i++) {
            if (names!=null && emails!=null) {
                TeacherList.add(repo.updateSingleTeacher(ids.get(i),names.get(i),emails.get(i)));
            } else if (names!=null && emails==null) {
                TeacherList.add(repo.updateSingleTeacher(ids.get(i),names.get(i),null));
            } else if (names==null && emails!=null) {
                TeacherList.add(repo.updateSingleTeacher(ids.get(i),null,emails.get(i)));
            }
        }
        return TeacherList;
    }

    @Override
    public Boolean deleteSingleTeacher(int id) {
        return repo.deleteSingleTeacher(id);
    }

    @Override
    public Boolean deleteMultipleTeacher(List<Integer> ids) {
        boolean result= false;
        List<Boolean> booleanList = new ArrayList<>();
        for(int i=0;i<ids.size();i++) {
            booleanList.add(repo.deleteSingleTeacher(ids.get(i)));
        }
        if (booleanList.size()>0){
            result = true;
        }
        return result;
    }

    @Override
    public Boolean deleteAllTeacher() {
        return repo.deleteAllTeacher();
    }
    @Override
    public String insertSingleStudent(Student student) {
        return teacherRepo.insertSingleStudent(student);
    }

    @Override
    public String insertMultipleStudent(List<Student> studentList) {
        String result = null;
        List<String> rs = new ArrayList<>();
        for(int i=0;i<studentList.size();i++) {
            rs.add(teacherRepo.insertSingleStudent(studentList.get(i)));
        }
        if (rs.size()>0){
            result = "Registered Successfully";
        }
        return result;
    }

    @Override
    public Student selectSingleStudent(int rollno) {
        return teacherRepo.selectSingleStudent(rollno);
    }

    @Override
    public List<Student> selectMultipleStudent(List<Integer> rollnos) {
        List<Student> studentList = new ArrayList<>();
        for(int i=0;i<rollnos.size();i++) {
            studentList.add(teacherRepo.selectSingleStudent(rollnos.get(i)));
        }
        return studentList;
    }

    @Override
    public List<Student> selectAllStudent() {
        return teacherRepo.selectAllStudent();
    }

    @Override
    public Student updateSingleStudent(int rollno, String name, String email) {
        return teacherRepo.updateSingleStudent(rollno,name,email);
    }

    @Override
    public List<Student> updateMultipleStudent(List<Integer> rollnos, List<String> names,List <String> emails) {
        List<Student> studentList = new ArrayList<>();
        for(int i=0;i<rollnos.size();i++) {
            if (names!=null && emails!=null) {
                studentList.add(teacherRepo.updateSingleStudent(rollnos.get(i),names.get(i),emails.get(i)));
            } else if (names!=null && emails==null) {
                studentList.add(teacherRepo.updateSingleStudent(rollnos.get(i),names.get(i),null));
            } else if (names==null && emails!=null) {
                studentList.add(teacherRepo.updateSingleStudent(rollnos.get(i),null,emails.get(i)));
            }
        }
        return studentList;
    }

    @Override
    public Boolean deleteSingleStudent(int rollno) {
        return teacherRepo.deleteSingleStudent(rollno);
    }

    @Override
    public Boolean deleteMultipleStudent(List<Integer> rollnos) {
        boolean result= false;
        List<Boolean> booleanList = new ArrayList<>();
        for(int i=0;i<rollnos.size();i++) {
            booleanList.add(teacherRepo.deleteSingleStudent(rollnos.get(i)));
        }
        if (booleanList.size()>0){
            result = true;
        }
        return result;
    }

    @Override
    public Boolean deleteAllStudent() {
        return teacherRepo.deleteAllStudent();
    }
}