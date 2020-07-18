package com.shivam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class sqServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
//		int k= (int)req.getAttribute("key"); // Used with RequestDispatcher
		
	//	int k=Integer.parseInt(req.getParameter("k")); //use it with sq?k=10
				
		//int j=k*k;
		
		
		HttpSession session=req.getSession();
		int k=(int)session.getAttribute("k");
		int j=k*k;
		
		
		PrintWriter out=res.getWriter();
		out.println("square is :  "+j);
		
		
	}
}
