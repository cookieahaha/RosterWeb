<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
    <%@ page import="me.kukkii.roster.Roster" %>
   <%@ page import="me.kukkii.roster.Player" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>Insert title here</title>
</head>
<body>

<%
String first = request.getParameter("first");
String last = request.getParameter("last");
%>

<p><%=first + " " + last + " was"%> registered</p>

<br>

<a href="showAll.jsp">display roster</a>


<form action="showAll.jsp" enctype="UTF-8" method="get">
<p><input type="submit" value="view roster" ></p>
</form>

</body>
</html>