package com.dilyor.hiddenformsession.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String eno = request.getParameter("eno");
        String ename = request.getParameter("ename");
        String equal = request.getParameter("equal");
        String edes = request.getParameter("edes");
        String eemail = request.getParameter("eemail");
        String emobile = request.getParameter("emobile");


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2 style='color:blue; text-align:center'>User Details</h2>");
        out.println("<table style='margin-left:auto; margin-right:auto; text-align:center' border='1'>");
        out.println("<tr><td>Employee Number</td><td>"+eno+"</td></tr>");
        out.println("<tr><td>Employee Name</td><td>"+ename+"</td></tr>");
        out.println("<tr><td>Employee Qualification</td><td>"+equal+"</td></tr>");
        out.println("<tr><td>Employee Designation</td><td>"+edes+"</td></tr>");
        out.println("<tr><td>Employee Email Id</td><td>"+eemail+"</td></tr>");
        out.println("<tr><td>Employee Mobile Number</td><td>"+emobile+"</td></tr>");

        out.println("</table></form></body></html>");
    }
}
