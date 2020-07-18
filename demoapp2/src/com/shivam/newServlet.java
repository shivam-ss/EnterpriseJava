package com.shivam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class newServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
    	PrintWriter out=res.getWriter();
    	out.println("this is servlet <br>");
    	ServletContext ctx=getServletContext();
    	String str=ctx.getInitParameter("Phone");
    	
    	
    	out.println(str);
    	
    }
}
