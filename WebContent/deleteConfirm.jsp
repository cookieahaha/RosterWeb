<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
        <%@ page import="me.kukkii.roster.Roster" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>Insert title here</title>
</head>
<body>
<%      String last = request.getParameter("last"); %>

<h1><%=last%> was deleted!</h1>

<br>

<a href="showAll.jsp">display roster</a>



<form action="Control" enctype="UTF-8" method="get">
<p><input type="submit" value="view roster" ></p>
<p><input type="hidden" name="action" value="list"></p>

</form>

</body>
</html>