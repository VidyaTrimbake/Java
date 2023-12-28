package myproject;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/Servlet2")
public class Servlet2 implements Servlet {

    
    public Servlet2() {
        
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
        
        
        PrintWriter out = response.getWriter();
        out.println("Welcome to First class of Servlet");
    }

}