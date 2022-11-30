<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
        <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

<title>Insert title here</title>
    <script src="https://cdn.datatables.net/1.13.1/js/dataTables.bootstrap4.min.js"></script>

        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
   		<script src="https://cdn.datatables.net/1.13.1/js/jquery.dataTables.min.js"></script>
        
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css
">
<link rel="stylesheet" href="https://cdn.datatables.net/1.13.1/css/dataTables.bootstrap4.min.css
">
	<script type="text/javascript">
	$(document).ready(function () {
		  $('#dtBasicExample').DataTable();
		  $('.dataTables_length').addClass('bs-select');
		});
</script>
<style type="text/css">

      tbody {
    display:block;
    height:200px;
    overflow:auto;
}
      thead, tbody  {
    display:table;
    width:100%;
    table-layout:fixed;
}
thead {
    
}


</style>
</head>
<body>
 <table id="dtBasicExample" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
  <thead>
    <tr>
      <th class="th-sm">Name
      </th>
      <th class="th-sm">Position
      </th>
      <th class="th-sm">Office
      </th>
      <th class="th-sm">Age
      </th>
      <th class="th-sm">Start date
      </th>
           </tr>
  </thead>
     <tbody>
  
        <c:forEach var="details" items= "${clockInout}">
   <tr>
    <td class="d">${details.emplyeno}</td>
    <td class="d">${details.login} &emsp; ${details.logintime} </td>
    <td class="d">${details.logout}&emsp; ${details.logouttime}</td>    
        <td class="d">${details.hours} </td>
        <td class="d">${details.comments}</td>
    
  </tr>
 
  
      
  
 
  </c:forEach>
    </tbody>
  <tfoot>
    <tr>
      <th>Name
      </th>
      <th>Position
      </th>
      <th>Office
      </th>
      <th>Age
      </th>
      <th>Start date
      </th>
     
    </tr>
  </tfoot>
</table>

</body>
</html>