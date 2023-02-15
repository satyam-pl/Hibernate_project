

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page import=" org.hibernate.*"%>
<%@page import=" com.helper.FactoryProvider"%>
<%@page import="org.hibernate.*"%>
<%@ page import="com.entities.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Page</title>
</head>
<body>
<%@include file="common_nav.jsp" %>
<h1>Edit your Note</h1>
<% 
int noteId=Integer.parseInt(request.getParameter("note_id").trim());
Session s = FactoryProvider.getFactory().openSession();
SaveNoteServlet nt=(SaveNoteServlet)s.get(SaveNoteServlet.class,noteId);

%>


<form action="UpdateServlet" method="get">
<input value="<%=nt.getId() %>" name=noteId type= "hidden"/>
  <div class="form-group">
    <label for="title">Note Title</label>
    <input required type="text" name="t1" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter Title" value="<%= nt.getTitle()%>">
    <small id="emailHelp" class="form-text text-muted">We are Happy to See You.</small>
  </div>
  
 <div class="form-group">
 <label for="content">Note Content</label>
 <textarea required name="t2" id="content"   placeholder="Enter your content Here"  class="form-control" style="height:200px;">
 <%=nt.getContent() %>
 
 
 </textarea>
 
 </div>
 <div class="container text-center" >
  <button type="submit" class="btn btn-primary">Save Your Note</button>
  </div>
</form>

</body>
</html>