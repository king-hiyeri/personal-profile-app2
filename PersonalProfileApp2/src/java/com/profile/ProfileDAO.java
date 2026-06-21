package com.profile;

import java.sql.*;
import java.util.ArrayList;


public class ProfileDAO {


    static String url =
    "jdbc:derby://localhost:1527/StudentProfilesDB";


    static String user = "app";

    static String password = "app";



    public static Connection getConnection() {


        Connection con = null;


        try {


            Class.forName(
            "org.apache.derby.jdbc.ClientDriver");


            con =
            DriverManager.getConnection(
            url,
            user,
            password);



        } catch(Exception e) {


            e.printStackTrace();

        }


        return con;

    }




    public static int save(ProfileBean p) {


        int status = 0;


        try {


            System.out.println(
            "CONNECTING DATABASE");


            Connection con =
            getConnection();



            PreparedStatement ps =
            con.prepareStatement(

            "INSERT INTO Profile VALUES(?,?,?,?,?,?)"

            );



            ps.setString(1,
            p.getStudentId());


            ps.setString(2,
            p.getName());


            ps.setString(3,
            p.getProgram());


            ps.setString(4,
            p.getEmail());


            ps.setString(5,
            p.getHobbies());


            ps.setString(6,
            p.getIntro());



            status =
            ps.executeUpdate();



            System.out.println(
            "DATA INSERTED: "
            + status);



            con.close();



        } catch(Exception e) {


            e.printStackTrace();

        }


        return status;

    }





    public static ArrayList<ProfileBean> getAllProfiles(){


        ArrayList<ProfileBean> list =
        new ArrayList<ProfileBean>();



        try {


            Connection con =
            getConnection();



            PreparedStatement ps =
            con.prepareStatement(
            "SELECT * FROM Profile");



            ResultSet rs =
            ps.executeQuery();



            while(rs.next()){



                ProfileBean p =
                new ProfileBean();



                p.setStudentId(
                rs.getString("studentId"));



                p.setName(
                rs.getString("name"));



                p.setProgram(
                rs.getString("program"));



                p.setEmail(
                rs.getString("email"));



                p.setHobbies(
                rs.getString("hobbies"));



                p.setIntro(
                rs.getString("intro"));



                list.add(p);

            }



            con.close();



        } catch(Exception e){


            e.printStackTrace();

        }



        return list;

    }

    public static ProfileBean searchById(String studentId){

    ProfileBean p = null;


    try {

        Connection con = getConnection();


        PreparedStatement ps =
        con.prepareStatement(
        "SELECT * FROM Profile WHERE studentId=?"
        );


        ps.setString(1, studentId);


        ResultSet rs =
        ps.executeQuery();


        if(rs.next()){


            p = new ProfileBean();


            p.setStudentId(
            rs.getString("studentId"));


            p.setName(
            rs.getString("name"));


            p.setProgram(
            rs.getString("program"));


            p.setEmail(
            rs.getString("email"));


            p.setHobbies(
            rs.getString("hobbies"));


            p.setIntro(
            rs.getString("intro"));

        }


        con.close();


    } catch(Exception e){

        e.printStackTrace();

    }


    return p;

}
    
}