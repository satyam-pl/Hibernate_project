<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add_Note</title>
</head>
<body>
<%@include file="common_nav.jsp" %>
<h1>Please Make Your Note</h1>

<form action="abc2" method="get">
  <div class="form-group">
    <label for="title">Note Title</label>
    <input required type="text" name="t1" class="form-control" id="title" aria-describedby="emailHelp" placeholder="Enter Title">
    <small id="emailHelp" class="form-text text-muted">We are Happy to See You.</small>
  </div>
  
 <div class="form-group">
 <label for="content">Note Content</label>
 <textarea required name="t2" id="content"   placeholder="Enter your content Here"  class="form-control" style="height:200px;">
 
 
 </textarea>
 
 </div>
 <div class="container text-center" >
  <button type="submit" class="btn btn-primary">Add</button>
  </div>
</form>
</body>
</html>