package org.example.repo.Impl;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;

import java.util.List;

public interface AdminRepoImpl {
    String insertSingleManagement(Management Management);
    Management selectSingleManagement(int roll);
    List<Management> selectAllManagement();
    Management updateSingleManagement(int roll,String name,String email);
    Boolean deleteSingleManagement(int roll);
    Boolean deleteAllManagement();

}
