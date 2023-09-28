package org.example.repo.Impl;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.Teacher;

import java.util.List;

public interface ManagementRepoImpl {
    String insertSingleTeacher(Teacher teacher);

    Teacher selectSingleTeacher(int id);
    List<Teacher> selectAllTeacher();
    Teacher updateSingleTeacher(int id,String name,String email);
    Boolean deleteSingleTeacher(int id);
    Boolean deleteAllTeacher();

}
