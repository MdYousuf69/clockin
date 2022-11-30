<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
                <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ClockInOut</title>
<link rel="icon" type="image/x-icon" href="file:///C:/Users/Shareef/Documents/springboottest/task1/src/main/resources/static/images/icon.jpg">

  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script> 
<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>

<script>
function sortTable() {
  var table, rows, switching, i, x, y, shouldSwitch;
  table = document.getElementById("myTable");
  switching = true;
 // console.log("message");
  /*Make a loop that will continue until
  no switching has been done:*/
  while (switching) {
    //start by saying: no switching is done:
    switching = false;
    rows = table.rows;
    /*Loop through all table rows (except the
    first, which contains table headers):*/
    for (i = 1; i < (rows.length - 1); i++) {
      //start by saying there should be no switching:
      shouldSwitch = false;
      /*Get the two elements you want to compare,
      one from current row and one from the next:*/
	   console.log("im 1");

      x = rows[i].getElementsByTagName("TD")[0];
      y = rows[i + 1].getElementsByTagName("TD")[0];
      //check if the two rows should switch place:
      if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
        //if so, mark as a switch and break the loop:
 
        shouldSwitch = true;
         break;
      }
    }
    if (shouldSwitch) {
      /*If a switch has been marked, make the switch
      and mark that a switch has been done:*/
	   console.log("im 3");

      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
     switching = true;
    }
  }
}
</script>

<style>


 
 .tableFixHead {
        overflow-y: auto;
height:350px;      }
      .tableFixHead thead th {
        position: sticky;
        top: 0;
         table-layout:fixed
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
       background-color: #D0D0D0;
  
 }
  
</style>
<style type="text/css">

#tbody {
    display:block;
    height:300px;
    overflow:auto;
}
 #tbody #tr {
    display:table;
    width:100%;
    table-layout:fixed;
}
#thead {
    display:table;
    width:100%;
    table-layout:fixed;
}



</style>
 <style type="text/css">
 
 
 
 </style>
 <script type="text/javascript">

 
 function  date(){
	   console.log("im hera");
	   var s= document.getElementById("from").value;
	   var s1= document.getElementById("to").value;
	   console.log(s1);
 let date1 = new Date(s);
 let date2 = new Date(s1);
 var message="*From Date Should Be Less Then To Date";
 if (date1 > date2) {
	 document.getElementById("valid").innerHTML=message;   
	 console.log("from date");
 }  else {
   console.log("");
 }
 
/}
 
 </script>
 
 <link rel="stylesheet" type="text/css" href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css">
 

         <script src="https://cdn.datatables.net/1.13.1/js/dataTables.bootstrap4.min.js"></script>

        <script src="https://code.jquery.com/jquery-3.5.1.js"></script>
   		<script src="https://cdn.datatables.net/1.13.1/js/jquery.dataTables.min.js"></script>
        
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.2/css/bootstrap.css
">
<link rel="stylesheet" href="https://cdn.datatables.net/1.13.1/css/dataTables.bootstrap4.min.css
">



 




  <script type="text/javascript">

   $(document).ready(function () {
	    $('#example').DataTable();
	});
   
   
   </script>
</head>
 <body>
 <div  id="head"   style="background-color:#6B5B95;">
        <BR>
       <center>  <h4 class="modal-title" style="color:#ffffff">CLOCK IN CLOCK OUT</h4></center> 
       <br>  </div>
 <div  id="body" ><h4>
       <!--   <BR> <BR>  <p align="right"> <a href="http://localhost:8080/result"><input type="button" value="Today" class="btn btn-primary"></a> &ensp;&emsp;   &emsp;&ensp;&emsp;   &emsp; </p> -->
      <table >
          <tr><td  style="width:40%"> <center>
       &ensp; &nbsp;&ensp; &nbsp;   <div class="div2" align="center" > 
 <form action="clockin" method="POST">
 <label>FROM</label>
<input type="date" name="from" id="from" placeholder="from"  style="width:200px;text-align: left" value=${datefrom}  max=${date} required="required"><input type="time" id="timein"  name="timein" value= "00:01"required="required"> <br><BR> 
  &ensp; &nbsp;<label>TO</label>&nbsp;
  
   	 <input type="date" name="to" id="to" height="10"style="width:200px;text-align: left" value=${date1}  max=${date} required="required"><input type="time" id="timeout" name="timeout"  value= ${time} required="required" ><br> 



 <br>
&ensp;&emsp;   &emsp;<input type="submit" name="submit" class="btn btn-primary" onclick="date()">&ensp;&emsp;   &emsp;
 
  
  <a href="http://localhost:8080/result"><input type="button" value="Today" class="btn btn-success"> 
 

 </center>
 </form>
 </td>
  <td >
   </div> </h4>
     <div style="width:60%">
          <table>
          
          <tr>      
          
           
  
        
          
    <div id="myChart" class="main" style="width:150%;  height:300px;">

          
                  <script>
google.charts.load('current', {'packages':['corechart']});
google.charts.setOnLoadCallback(drawChart);

function drawChart() {
var data = google.visualization.arrayToDataTable([
  ['Contry', 'Mhl'],
  <c:forEach var="weeks" items= "${week}">
  
  ['${weeks.days}', ${weeks.noofemploye}],
 
  </c:forEach>

]);

var options = {
  title:'Week Report'
};

var chart = new google.visualization.PieChart(document.getElementById('myChart'));
  chart.draw(data, options);
}
</script>
          
                

          
          
          
          
          
          
          
          
          
           </tr>
          
          
          
              <h4>
           <tr>  <th height="30"  style="color:#ffffff; width:20%">NO Of EMPLOYEE: ${noofemp}</th>
          <th height="30" ,width="10"style="color:#ffffff;width:20%">NO OF RECORDES: ${records}</th></tr><h4>
                  
 </table>
  </td></tr>
 </table> 
</div>
 
 </div>
 
    
 
 
 
   
     
     <h2>
<table  data-toggle="table" 
       data-classes="table table-hover table-condensed"
       data-striped="true"
       data-sort-name="Quality"
       data-sort-order="desc" id="example" class="table"  >
 <thead id="thead">
  <tr id="tr"> 
   
       <th width="260px"   height="20" style="color:#ffffff" ><h4>EMPLOYE ID</h4></th>  
   <th width="260px"  height="20" style="color:#ffffff"><h4>LOGIN IN</h4></th>  
     <th width="260px"  height="20" style="color:#ffffff"><h4>LOGOUT</h4></th> 
    <th  width="260px" height="20" style="color:#ffffff"><h4>HOURS</h4></th>  
     <th   height="20" style="color:#ffffff"><h4>COMMENTS</h4></th> 
    
   </tr>
   </thead> 
 <tbody id="tbody">
 
     <c:forEach var="details" items= "${clockInout}">
  
   
      
  <tr id="tr">
   
    <td class="d"   height="20"><h4>${details.emplyeno}</h4></td>
    <td class="d"   height="20"><h4>${details.login} &emsp; ${details.logintime}</h4> </td>
    <td class="d" height="20"><h4>${details.logout}&emsp; ${details.logouttime}</h4></td>    
        <td class="d"  height="20"><h4>${details.hours}</h4> </td>
        <td class="d"   height="20"><h4>${details.comments}</h4></td>
    
  </tr>
 
  
      
  
 
  </c:forEach>
   </tbody> 
</table>
   </h2> 
    </div>
   </body>
</html>