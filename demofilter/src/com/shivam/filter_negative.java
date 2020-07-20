package com.shivam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
/**
 * Servlet Filter implementation class filter_negative
 */
@WebFilter("/addition")
public class filter_negative implements Filter {


	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req=(HttpServletRequest) request;  //type casting	
		
		int a=Integer.parseInt(req.getParameter("num1"));
		
		if(a>0) {
			
			chain.doFilter(request, response);
		}
		else {
			PrintWriter out=response.getWriter();
			out.println("failed to call servlet, please enter positive value");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
