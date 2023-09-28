package org.example.repo;

import org.example.model.Student;
import org.example.repo.Impl.StudentRepoImpl;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

@Repository
public class RepoStudent implements StudentRepoImpl {
}
