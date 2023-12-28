package com.welcome;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/FirstServlet")
public class FirstServlet implements Servlet {

    
    public FirstServlet() {
        
    }

    
    public void init(ServletConfig config) throws ServletException {
        
    }

    
    public void destroy() {
    
    }

    
    public ServletConfig getServletConfig() {
        
        return null;
    }

    
    public String getServletInfo() {
    
        return null; 
    }

    
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        
//        response.setContentType("text/html");
//        PrintWriter writer = response.getWriter();
//        writer.println("Chaitanya Phalke");
//        writer.println("Welcome to First class of Servlet");
        
        PrintWriter out = response.getWriter();
        out.println("Welcome to First class of Servlet");
    }

}