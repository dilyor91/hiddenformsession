package com.dilyor.hiddenformsession.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/second")
public class SecondServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String eno = request.getParameter("eno");
        String ename = request.getParameter("ename");
        String equal = request.getParameter("equal");
        String edes = request.getParameter("edes");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h2 style='color:blue; text-align:center'>User Registration Form[...]</h2>");
        out.println("<form action='./display' method='post'>");
        out.println("<table style='margin-left:auto; margin-right:auto; text-align:center'>");
        out.println("<tr><td>Employee Email</td>");
        out.println("<td><input type='text' name='eemail'></td></tr>");
        out.println("<tr><td>Employee Mobile Number</td>");
        out.println("<td><input type='text' name='emobile'></td></tr>");
        out.println("<tr><td><input type='submit' value='Display'>");
        out.println("<input type='hidden' name='eno' value="+eno+">");
        out.println("<input type='hidden' name='ename' value="+ename+">");
        out.println("<input type='hidden' name='equal' value="+equal+">");
        out.println("<input type='hidden' name='edes' value="+edes+">");
        out.println("</table></form></body></html>");
    }
}
