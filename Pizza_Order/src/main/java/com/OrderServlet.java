package com;
import java.io.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/OrderPizza")
public class OrderServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>Your Order Are....</h1>");
		Map<String,String[]> m=request.getParameterMap();
		Set<Entry<String,String[]>> s=m.entrySet();
		out.println("<html><body><table border=4px>");
		int a=0;
		for(Entry<String,String[]> e:s)
		{
			String name=e.getKey();
			
			String[] s2=e.getValue();
			for(String s3:s2)
			{
				if(name.equalsIgnoreCase("Topping"))
				{
					++a;
					if(a==1)
					out.println("<tr><td>"+name+"</td><td>"+s3+"</td></tr>");
					else
						out.println("<tr><td></td><td>"+s3+"</td></tr>");
					
				}
				else
				
				out.println("<tr><td>"+name+"</td><td>"+s3+"</td></tr>");
				
			}
			
		}
		out.println("</table></body></html>");
	}
	}
	
	
	
	
	
//	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		PrintWriter out=response.getWriter();
//		response.setContentType("text/html");
//		out.println("<h1>Your Order Are....</h1>");
//		Map<String,String[]> m=request.getParameterMap();
//		Set<Entry<String,String[]>> s=m.entrySet();
//		out.println("<html><body><table border=4px>");
//		int a=0;
//		for(Entry<String,String[]> e:s)
//		{
//			String name=e.getKey();
//			
//			String[] s2=e.getValue();
//			for(String s3:s2)
//			{
//				if(name.equalsIgnoreCase("Topping"))
//				{
//					++a;
//					if(a==1)
//					out.println("<tr><td>"+name+"</td><td>"+s3+"</td></tr>");
//					else
//						out.println("<tr><td></td><td>"+s3+"</td></tr>");
//					
//				}
//				else
//				
//				out.println("<tr><td>"+name+"</td><td>"+s3+"</td></tr>");
//				
//			}
//			
//		}
//		out.println("</table></body></html>");
//	}
	
        
      
