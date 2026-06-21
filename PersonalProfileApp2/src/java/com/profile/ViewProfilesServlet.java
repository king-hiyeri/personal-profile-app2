package com.profile;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.http.*;

@WebServlet("/ViewProfilesServlet")
public class ViewProfilesServlet extends HttpServlet {


protected void doGet(
HttpServletRequest request,
HttpServletResponse response)

throws ServletException, IOException {


    ArrayList<ProfileBean> profiles =
    ProfileDAO.getAllProfiles();


    request.setAttribute(
    "profiles",
    profiles);


    RequestDispatcher rd =
    request.getRequestDispatcher(
    "viewProfiles.jsp");


    rd.forward(request,response);


}

}