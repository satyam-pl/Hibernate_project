package com.entities;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transaction;
import java.util.*;
import org.hibernate.Session;

import com.helper.FactoryProvider;


public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	try
	{
	String title=request.getParameter("t1");
	String content= request.getParameter("t2");
	int noteId=Integer.parseInt(request.getParameter("noteId").trim());
	
	Session s = FactoryProvider.getFactory().openSession();
	Transaction tx=(Transaction) s.beginTransaction();
	
	SaveNoteServlet nt=s.get(SaveNoteServlet.class,noteId);
	
	nt.setTitle(title);
	nt.setContent(content);
   nt.setAddDate(new Date());
   
   response.sendRedirect("all_notes.jsp");
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	
}
