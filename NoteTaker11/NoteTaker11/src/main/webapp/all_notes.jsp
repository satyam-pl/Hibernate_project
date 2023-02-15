
<%@page import="java.util.*"%>

<%@page import="org.hibernate.Query"%>
<%@page import="java.io.PrintWriter"%>

<%@page import="javax.servlet.ServletException"%>

<%@page import=" org.hibernate.*"%>
<%@page import=" com.helper.FactoryProvider"%>
<%@page import="org.hibernate.*"%>
<%@ page import="com.entities.*"%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Notes</title>
</head>
<body>
<div>
<%@include file="common_nav.jsp" %>
<br>
<h1 class="text-uppercase">All Notes:</h1>


<div class="row">

<div class="col-12">

<%
Session s = FactoryProvider.getFactory().openSession();
Query q=s.createQuery("from SaveNoteServlet");

List<SaveNoteServlet> list=q.list();
for(SaveNoteServlet nt:list)
{
	%>
	<div class="card" >
 
  <div class="card-body">
    <h5 class="card-title"><%=nt.getTitle() %></h5>
    <p class="card-text"><%=nt.getContent() %></p>
   
    
    <a href="DeleteServlet?note_id=<%=nt.getId() %>"class=btn btn-danger">Delete</a>
    
    <a href="Edit.jsp?note_id=<%nt.getId() %>" class="btn btn-primary">Update</a>
    
  </div>
</div>
	
	 
	
	
	<%
	s.close();
}

%>



</div>


</div>



</div>
</body>
</html>