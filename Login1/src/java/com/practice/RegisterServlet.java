/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;




public class RegisterServlet extends HttpServlet{
    
    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
        response.setContentType("Text/html");
        PrintWriter out=response.getWriter();
        out.print("<h2>Wellcome to Servlet!!!</h2>");
        String name=request.getParameter("user_name");
        String password=request.getParameter("user_pass");
        String email=request.getParameter("user_email");
        String gender=request.getParameter("user_gender");
        String course=request.getParameter("user_course");
        String checked=request.getParameter("condition");
        
        if(checked!=null)
        {
            if(checked.equals("checked"))
            {
                out.println("<h2> Name :"+name+"</h2>");
                out.println("<h2> Password :"+password+"</h2>");
                out.println("<h2> email :"+email+"</h2>");
                out.println("<h2> gender :"+gender+"</h2>");
                out.println("<h2> course :"+course+"</h2>");
                
                
                RequestDispatcher rd=request.getRequestDispatcher("success");
                rd.forward(request, response);
                
            }
        }
        else
        {
            out.println("<h2> you not checked terms and conditions!!!!");
            
            //I want to include output on index.html
            
            //get the output of RequestDespatchare()
            
            RequestDispatcher rd =request.getRequestDispatcher("index.html");
            //include method of RequestDispatcher
            rd.include(request, response);
            
            
            
            
            
        }
    }
    
}
