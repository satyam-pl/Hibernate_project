
<%@page import="java.util.*"%>;

<%@page import="java.io.IOException"%>;
<%@page import="java.io.PrintWriter"%>;

<%@page import="javax.servlet.ServletException"%>;

<%@page import=" org.hibernate.*"%>;
<%@page import=" com.helper.FactoryProvider"%>;
<%@page import="org.hibernate.*"%>
<%@ page import="com.entities.*"%>




<% 
String s1=request.getParameter("t1");
		String s2=request.getParameter("t2");
	 SaveNoteServlet note = new SaveNoteServlet(0,s1,s2,new Date());
		Session s = FactoryProvider.getFactory().openSession();
			Transaction tx= s.beginTransaction();
			s.save(note);
			tx.commit();
			s.close();
		
%>
