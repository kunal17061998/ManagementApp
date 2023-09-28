package org.example.service;

import org.example.model.Student;
import org.example.repo.Impl.TeacherRepoImpl;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class TeacherService implements TeacherServiceImpl {
        @Autowired
        private TeacherRepoImpl repo;
        @Override
        public String insertSingleStudent(Student student) {
            return repo.insertSingleStudent(student);
        }

        @Override
        public String insertMultipleStudent(List<Student> studentList) {
            String result = null;
            List<String> rs = new ArrayList<>();
            for(int i=0;i<studentList.size();i++) {
                rs.add(repo.insertSingleStudent(studentList.get(i)));
            }
            if (rs.size()>0){
                result = "Registered Successfully";
            }
            return result;
        }

        @Override
        public Student selectSingleStudent(int rollno) {
            return repo.selectSingleStudent(rollno);
        }

        @Override
        public List<Student> selectMultipleStudent(List<Integer> rollnos) {
            List<Student> studentList = new ArrayList<>();
            for(int i=0;i<rollnos.size();i++) {
                studentList.add(repo.selectSingleStudent(rollnos.get(i)));
            }
            return studentList;
        }

        @Override
        public List<Student> selectAllStudent() {
            return repo.selectAllStudent();
        }

        @Override
        public Student updateSingleStudent(int rollno, String name, String email) {
            return repo.updateSingleStudent(rollno,name,email);
        }

        @Override
        public List<Student> updateMultipleStudent(List<Integer> rollnos, List<String> names,List <String> emails) {
            List<Student> studentList = new ArrayList<>();
            for(int i=0;i<rollnos.size();i++) {
                if (names!=null && emails!=null) {
                    studentList.add(repo.updateSingleStudent(rollnos.get(i),names.get(i),emails.get(i)));
                } else if (names!=null && emails==null) {
                    studentList.add(repo.updateSingleStudent(rollnos.get(i),names.get(i),null));
                } else if (names==null && emails!=null) {
                    studentList.add(repo.updateSingleStudent(rollnos.get(i),null,emails.get(i)));
                }
            }
            return studentList;
        }

        @Override
        public Boolean deleteSingleStudent(int rollno) {
            return repo.deleteSingleStudent(rollno);
        }

        @Override
        public Boolean deleteMultipleStudent(List<Integer> rollnos) {
            boolean result= false;
            List<Boolean> booleanList = new ArrayList<>();
            for(int i=0;i<rollnos.size();i++) {
                booleanList.add(repo.deleteSingleStudent(rollnos.get(i)));
            }
            if (booleanList.size()>0){
                result = true;
            }
            return result;
        }

        @Override
        public Boolean deleteAllStudent() {
            return repo.deleteAllStudent();
        }
}
