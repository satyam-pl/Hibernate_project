package com.entities;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transaction;

import org.hibernate.Session;

import com.helper.FactoryProvider;


public class DeleteServlet extends HttpServlet {
	
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try
		{
			int noteId=Integer.parseInt(request.getParameter("note_id").trim());
			
	Session s = FactoryProvider.getFactory().openSession();
	Transaction tx=(Transaction) s.beginTransaction();
	
	SaveNoteServlet st=(SaveNoteServlet)s.get(SaveNoteServlet.class, noteId);
	s.delete(st);
	tx.commit();
	s.close();
	response.sendRedirect("all_notes.jsp");
			
		}
		catch(Exception e)
		{
			
			
		}
	}

	

}
