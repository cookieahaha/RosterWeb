<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
    
<%@ page import="me.kukkii.roster.Roster" %>
<%@ page import="me.kukkii.roster.Player" %>
<%@ page import="java.util.Map" %>
<%@ page import="me.kukkii.roster.MountainLion" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>Insert title here</title>
</head>
<body>
<% 
Player[] all = (Player[])request.getAttribute("array");
%>

<table border="1" cellpadding="5" cellspacing="0">
<tr>

<td>
<form action="Control" enctype="UTF-8" method="get">
<input type="submit" value="First" ></p>
<input type="hidden" name="action" value="sort" >
<input type="hidden" name="sortType" value="first" >
</td>

<td>
<form action="Control" enctype="UTF-8" method="get">
<input type="submit" value="Last" ></p>
<input type="hidden" name="action" value="sort" >
<input type="hidden" name="sortType" value="last" >
</td>

<td>
<form action="Control" enctype="UTF-8" method="get">
<input type="submit" value="Number" ></p>
<input type="hidden" name="action" value="sort" >
<input type="hidden" name="sortType" value="number" >
</td>

<td>
<form action="Control" enctype="UTF-8" method="get">
<input type="submit" value="Position" ></p>
<input type="hidden" name="action" value="sort" >
<input type="hidden" name="sortType" value="position" >
</td>

<td>
<form action="Control" enctype="UTF-8" method="get">
<input type="submit" value="BattingAverage" ></p>
<input type="hidden" name="action" value="sort" >
<input type="hidden" name="sortType" value="battingAverage" >
</td>

<td>
<form action="Control" enctype="UTF-8" method="get">
<input type="submit" value="HomeTown" ></p>
<input type="hidden" name="action" value="sort" >
<input type="hidden" name="sortType" value="homeTown" >
</td>

<td>
<form action="Control" enctype="UTF-8" method="get">
<input type="submit" value="HighSchool" ></p>
<input type="hidden" name="action" value="sort" >
<input type="hidden" name="sortType" value="highSchool" >
</td>

</tr>

<%
for(int i=0; i<all.length; i++){ %>
<tr>
<td><%=  all[i].getFirstName() %></td>
<td><%=  all[i].getLastName() %></td>
<td><%=  all[i].getNumber()%></td>
<td><%=  all[i].getPosition()%></td>
<td><%=  all[i].getBattingAverage()%></td>
<td><%=  all[i].getHomeTown()%></td>
<td><%=  all[i].getHighSchool()%></td>

<td> 
<form action="Control" enctype="UTF-8" method="get">
<p><input type="submit" value="delete" ></p>
<p><input type="hidden" name="action" value="delete"></p>
<p><input type="hidden" name="last" value="<%=all[i].getLastName() %>"></p>
</form> 
</td>

<td> 
<form action="Control" enctype="UTF-8" method="get">
<p><input type="submit" value="update" ></p>
<p><input type="hidden" name="action" value="update"></p>
<p><input type="hidden" name="last" value="<%=all[i].getLastName() %>"></p>
</form> 
</td>

</tr>
<% }
%>

</table>

<form action="read.jsp" enctype="UTF-8" method="get">
<p><input type="submit" value="add" ></p>
</form>

</body>
</html>