package com.entities;
import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import org.hibernate.*;
import com.helper.FactoryProvider;





public class SavingNote extends HttpServlet {
	
	
	public SavingNote() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try
		{
		String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
		SaveNoteServlet note = new SaveNoteServlet(0,s1,s2,new Date());
		//System.out.println("hello");
		
		    Session s = FactoryProvider.getFactory().openSession();
			Transaction tx= s.beginTransaction();
			s.save(note);
			tx.commit();
			s.close();
		    response.setContentType("text/html");
          	PrintWriter out=response.getWriter();
	        out.println("<h1 style='text-align:center;'>Note is added successfully </h1>");
	        out.println("<h1 style='text-align:center;'><a href='all_notes.jsp'>View All Notes");
		
		 }
		
	catch(Exception e)
	    {
		  System.out.println(e);
	    }
	} 

}
