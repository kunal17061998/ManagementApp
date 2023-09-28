package org.example.repo;

import org.example.model.Student;
import org.example.model.Teacher;
import org.example.model.Teacher;
import org.example.repo.Impl.ManagementRepoImpl;
import org.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoManagement implements ManagementRepoImpl {

    
    @Override
    public String insertSingleTeacher(Teacher Teacher) {
        String mes=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            int count = st.executeUpdate("insert into Teacher values('"+Teacher.getId()+"','"+Teacher.getName()+"','"+Teacher.getEmail()+"')");
            if (count>0){
                mes= "Your have been Registered successfully";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return mes;
    }

    @Override
    public Teacher selectSingleTeacher(int id) {
        Teacher Teacher = new Teacher();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Teacher where id='"+id+"'");
            while (rs.next()){
                Teacher.setId(rs.getInt(1));
                Teacher.setName(rs.getString(2));
                Teacher.setEmail(rs.getString(3));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return Teacher;
    }

    @Override
    public List<Teacher> selectAllTeacher() {
        List<Teacher> TeacherList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * Teacher");
            while(rs.next()){
                Teacher Teacher = new Teacher();
                Teacher.setId(rs.getInt(1));
                Teacher.setName(rs.getString(2));
                Teacher.setEmail(rs.getString(3));
                TeacherList.add(Teacher);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return TeacherList;
    }

    @Override
    public Teacher updateSingleTeacher(int id, String name, String email) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            if (name!= null && email!=null){
                st.executeUpdate("update Teacher set name='"+name+"' ,email='"+email+"' where id='"+id+"'");
            } else if (name!=null && email==null) {
                st.executeUpdate("update Teacher set name='"+name+"' where id='"+id+"'");
            } else if (name==null && email!=null) {
                st.executeUpdate("update Teacher set email='"+email+"' where id='"+id+"'");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return selectSingleTeacher(id);
    }

    @Override
    public Boolean deleteSingleTeacher(int id) {
        boolean result= false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            int count =0;
            count = st.executeUpdate("delete from Teacher where id='"+id+"'");
            if (count>0){
                result = true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public Boolean deleteAllTeacher() {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            int count = 0;
            count = st.executeUpdate("delete from Teacher");
            if (count>0){
                result = true;
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

}
