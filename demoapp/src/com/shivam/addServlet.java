package com.shivam;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class addServlet extends HttpServlet {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		
		int c=a+b;
		
		//PrintWriter out= res.getWriter();
		//out.println("sum is : "+c);
		
		//calling the sqServlet from this servlet
		
		int k=a+b;
		
//		req.setAttribute("key", k); //key value pair
//		
//		RequestDispatcher rd=req.getRequestDispatcher("/sq");
//		rd.forward(req, res);
		
//		res.sendRedirect("sq?k=10"+k);  //passing the value also
		
		//passing values using  sessions:
		
		HttpSession session=req.getSession();
		session.setAttribute("k", k);
		res.sendRedirect("sq");
		
		
		
	}
	
}
