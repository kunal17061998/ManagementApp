package org.example.repo;

import org.example.model.Student;
import org.example.repo.Impl.TeacherRepoImpl;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoTeacher implements TeacherRepoImpl {

    @Override
    public String insertSingleStudent(Student student) {
        String mes=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            int count = st.executeUpdate("insert into student values('"+student.getRollno()+"','"+student.getName()+"','"+student.getEmail()+"')");
            if (count>0){
                mes= "Your have been Registered successfully";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return mes;
    }

    @Override
    public Student selectSingleStudent(int rollno) {
        Student student = new Student();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student where rollno='"+rollno+"'");
           while (rs.next()){
              student.setRollno(rs.getInt(1));
              student.setName(rs.getString(2));
              student.setEmail(rs.getString(3));
           }
        }catch (Exception e){
            System.out.println(e);
        }
        return student;
    }

    @Override
    public List<Student> selectAllStudent() {
        List<Student> studentList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * student");
            while(rs.next()){
                Student student = new Student();
                student.setRollno(rs.getInt(1));
                student.setName(rs.getString(2));
                student.setEmail(rs.getString(3));
                studentList.add(student);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return studentList;
    }

    @Override
    public Student updateSingleStudent(int rollno, String name, String email) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            if (name!= null && email!=null){
                st.executeUpdate("update student set name='"+name+"' ,email='"+email+"' where rollno='"+rollno+"'");
            } else if (name!=null && email==null) {
                st.executeUpdate("update student set name='"+name+"' where rollno='"+rollno+"'");
            } else if (name==null && email!=null) {
                st.executeUpdate("update student set email='"+email+"' where rollno='"+rollno+"'");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return selectSingleStudent(rollno);
    }

    @Override
    public Boolean deleteSingleStudent(int rollno) {
        boolean result= false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            int count =0;
            count = st.executeUpdate("delete from student where rollno='"+rollno+"'");
           if (count>0){
               result = true;
           }
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public Boolean deleteAllStudent() {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            int count = 0;
           count = st.executeUpdate("delete from student");
           if (count>0){
               result = true;
           }
        }catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }
}
