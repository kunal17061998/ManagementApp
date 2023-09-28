package org.example.repo;

import org.example.model.Management;
import org.example.model.Student;
import org.example.model.Teacher;
import org.example.repo.Impl.AdminRepoImpl;
import org.springframework.stereotype.Repository;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AdminRepo implements AdminRepoImpl {
    
    @Override
    public String insertSingleManagement(Management Management) {
        String mes=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            int count = st.executeUpdate("insert into Management values('"+Management.getRoll()+"','"+Management.getName()+"','"+Management.getEmail()+"')");
            if (count>0){
                mes= "Your have been Registered successfully";
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return mes;
    }

    @Override
    public Management selectSingleManagement(int roll) {
        Management Management = new Management();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from Management where roll='"+roll+"'");
            while (rs.next()){
                Management.setRoll(rs.getInt(1));
                Management.setName(rs.getString(2));
                Management.setEmail(rs.getString(3));
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return Management;
    }

    @Override
    public List<Management> selectAllManagement() {
        List<Management> ManagementList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * Management");
            while(rs.next()){
                Management Management = new Management();
                Management.setRoll(rs.getInt(1));
                Management.setName(rs.getString(2));
                Management.setEmail(rs.getString(3));
                ManagementList.add(Management);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return ManagementList;
    }

    @Override
    public Management updateSingleManagement(int roll, String name, String email) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            if (name!= null && email!=null){
                st.executeUpdate("update Management set name='"+name+"' ,email='"+email+"' where roll='"+roll+"'");
            } else if (name!=null && email==null) {
                st.executeUpdate("update Management set name='"+name+"' where roll='"+roll+"'");
            } else if (name==null && email!=null) {
                st.executeUpdate("update Management set email='"+email+"' where roll='"+roll+"'");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return selectSingleManagement(roll);
    }

    @Override
    public Boolean deleteSingleManagement(int roll) {
        boolean result= false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ListApis","root","");
            Statement st = con.createStatement();
            int count =0;
            count = st.executeUpdate("delete from Management where roll='"+roll+"'");
            if (count>0){
                result = true;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return result;
    }

    @Override
    public Boolean deleteAllManagement() {
        boolean result = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/listApis","root","");
            Statement st = con.createStatement();
            int count = 0;
            count = st.executeUpdate("delete from Management");
            if (count>0){
                result = true;
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

}
