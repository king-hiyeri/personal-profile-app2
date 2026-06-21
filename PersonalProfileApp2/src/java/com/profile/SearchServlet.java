package com.profile;


import java.io.IOException;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;



@WebServlet("/SearchServlet")


public class SearchServlet extends HttpServlet {


protected void doPost(
HttpServletRequest request,
HttpServletResponse response)

throws ServletException, IOException {



String studentId =
request.getParameter("studentId");



ProfileBean profile =
ProfileDAO.searchById(studentId);



request.setAttribute(
"profile",
profile);



RequestDispatcher rd =
request.getRequestDispatcher(
"/WEB-INF/profile.jsp");



rd.forward(request,response);


}

}