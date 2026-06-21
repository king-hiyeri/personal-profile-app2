package com.profile;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet("/ProfileServlet")

public class ProfileServlet extends HttpServlet {


    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {


        // Get data from form

        String name =
                request.getParameter("name");

        String studentId =
                request.getParameter("studentId");

        String program =
                request.getParameter("program");

        String email =
                request.getParameter("email");

        String hobbies =
                request.getParameter("hobbies");

        String intro =
                request.getParameter("intro");


        // Create JavaBean object

        ProfileBean profile =
                new ProfileBean();


        profile.setName(name);

        profile.setStudentId(studentId);

        profile.setProgram(program);

        profile.setEmail(email);

        profile.setHobbies(hobbies);

        profile.setIntro(intro);



        // Debug message

        System.out.println("PROFILE SERVLET RUNNING");



        // Save into database

        int result =
                ProfileDAO.save(profile);



        System.out.println(
                "INSERT RESULT: " + result);



        // Send data to JSP

        request.setAttribute(
                "profile",
                profile);



        RequestDispatcher rd =
                request.getRequestDispatcher(
                "/WEB-INF/profile.jsp");


        rd.forward(
                request,
                response);

    }

}