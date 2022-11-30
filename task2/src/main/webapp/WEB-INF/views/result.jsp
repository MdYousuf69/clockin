<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ClockInOut</title>
<link rel="icon" type="image/x-icon" href=" C:/Users/Shareef/Documents/springboottest/task1/src/main/resources/static/images/icon.jpg">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 

<style>

 
 .tableFixHead {
        overflow-y: auto;
height:550px;      }
      .tableFixHead thead th {
        position: sticky;
        top: 0;
      }
      table {
        border-collapse: collapse;
        width: 100%;
      }
      th
        {
        padding: 8px 16px;
        border: 1px solid #ccc;
      }
       .d {
        padding: 8px 16px;
        border: 1px solid #ccc;
      }
      th {
        background:#6B5B95 ;
      }
      
      
      
.div2 {
  width: 440px;
  height: 200px;
  padding: 50px;
  border: 1px solid black;
}
  
</style>
 <script>
    function refreshPage()
    {
        window.location = window.location.href;
    }
    setInterval('refreshPage()',100000);
</script>
 
</head>
<body>

<div   height="1" style="background-color:#6B5B95" >
        <BR>
       <center>  <h4 class="modal-title" style="color:#ffffff">CLOCK IN CLOCK OUT</h4></center> 
       <br>  </div>

<h4 >TODAY : ${start} &emsp; </h4>
     <div class="tableFixHead">
<table>
   <thead>
  <tr>
    <label> <th height="50" style="color:#ffffff">EMPLOYE ID</th></label>
   <label> <th height="50" style="color:#ffffff">LOGIN IN</th></label>
    <label><th height="50" style="color:#ffffff">LOGOUT</th></label>
    <label>    <th height="50" style="color:#ffffff">HOURS</th></label>
        <label>    <th height="50" style="color:#ffffff">COMMENTS</th></label>
    
   </tr>
   </thead>

 
     <c:forEach var="details" items= "${clockInout}">
  
   
       <tbody>
  <tr>
   
  <td class="d">${details.emplyeno}</td>
    <td class="d">${details.login} &emsp; ${details.timein} </td>
    <td class="d">${details.logout}&emsp; ${details.timeout}</td>    
        <td class="d">${details.hours} </td>
        <td class="d">${details.comments}</td>
    
  </tr>
 
  
       </tbody>
  
 
  </c:forEach>
</table>
 </div>
</body>
</html>