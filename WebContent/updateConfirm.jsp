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
String number = request.getParameter("number");
String position = request.getParameter("position");
double battingAverage = Double.parseDouble(request.getParameter("battingAverage"));
String hometown = request.getParameter("hometown");
String highSchool = request.getParameter("highSchool");

Player player = new Player(first, last, number, position, battingAverage, hometown, highSchool);
Roster.getRoster().addPlayer(last, player);

%>

<h1>updated</h1>

<br>

<a href="showAll.jsp">display roster</a>


<form action="showAll.jsp" enctype="UTF-8" method="get">
<p><input type="submit" value="view roster" ></p>
</form>

</body>
</html>