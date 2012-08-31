<%@ page language="java" contentType="text/html; charset=Shift_JIS"
    pageEncoding="Shift_JIS"%>
            <%@ page import="me.kukkii.roster.Roster" %>
            <%@ page import="me.kukkii.roster.Player" %>
            <%@ page import="javax.servlet.RequestDispatcher" %>
            <%@ page import="javax.servlet.ServletContext" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=Shift_JIS">
<title>Insert title here</title>
</head>
<body>

<% 
//String last = request.getParameter("last");
//Player player = Roster.getRoster().lookUpPlayer(last);
Player player = (Player)request.getAttribute("player");
%>

<form action="UpdateServlet" enctype="UTF-8" method="get">
<p><label>first <input type="text" name="first" value="<%=player.getFirstName()%>"></label></p>
<p><label>last <input type="text" name="last" value="<%=player.getLastName()%>" ></label></p>
<p><label>number <input type="text" name="number" value="<%=player.getNumber()%>" ></label></p>
<p><label>position <input type="text" name="position" value="<%=player.getPosition()%>" ></label></p>
<p><label>batting average <input type="text" name="battingAverage" value="<%=player.getBattingAverage()%>"></label></p>
<p><label>hometown <input type="text" name="hometown" value="<%=player.getHomeTown()%>" ></label></p>
<p><label>highschool <input type="text" name="highSchool" value="<%=player.getHighSchool()%>" ></label></p>

<p><input type="hidden" name="oldLast" value="<%=player.getLastName()%>" ></p>

<p><input type="submit" value="update player" ></p>
</form>

</body>
</html>