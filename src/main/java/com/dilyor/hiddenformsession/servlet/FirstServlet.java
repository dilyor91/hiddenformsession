package com.dilyor.hiddenformsession.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String eno = request.getParameter("eno");
        String ename = request.getParameter("ename");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2 style='color:blue; text-align:center'>User Registration Form[...]</h2>");
        out.println("<form action='./second' method='post'>");
        out.println("<table style='margin-left:auto; margin-right:auto; text-align:center'>");
        out.println("<tr><td>Employee Qualification</td>");
        out.println("<td><input type='text' name='equal'></td></tr>");
        out.println("<tr><td>Employee Designation</td>");
        out.println("<td><input type='text' name='edes'></td></tr>");
        out.println("<tr><td><input type='submit' value='NEXT'>");
        out.println("<input type='hidden' name='eno' value="+eno+">");
        out.println("<input type='hidden' name='ename' value="+ename+">");
        out.println("</table></form></body></html>");
    }
}
