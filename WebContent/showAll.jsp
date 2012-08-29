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
Player[] all = Roster.getRoster().getAll();
for(int i=0; i<all.length; i++){ %>
<%=  all[i].getFirstName() %>
<%=  all[i].getLastName() %>
<%=  all[i].getNumber()%>
<%=  all[i].getPosition()%>
<%=  all[i].getBattingAverage()%>
<%=  all[i].getHomeTown()%>
<%=  all[i].getHighSchool()%>
<br>
<% }
%>
</body>
</html>