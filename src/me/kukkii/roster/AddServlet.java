package me.kukkii.roster;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class add
 */
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      
    String first = request.getParameter("first");
    String last = request.getParameter("last");
    String number = request.getParameter("number");
    String position = request.getParameter("position");
    double battingAverage = 0.0;
    try{
      battingAverage = Double.parseDouble(request.getParameter("battingAverage"));
    }
    catch(NumberFormatException e){
      ServletContext sc = getServletContext();
      RequestDispatcher rd = sc.getRequestDispatcher("/cantFind.html");
      rd.forward(request, response);    
      return;
    }
    String hometown = request.getParameter("hometown");
    String highSchool = request.getParameter("highSchool");
    
    Player player = new Player(first, last, number, position, battingAverage, hometown, highSchool);
    Roster.getRoster().addPlayer(last, player);
    
    ServletContext sc = getServletContext();
    RequestDispatcher rd = sc.getRequestDispatcher("/add.jsp");
    rd.forward(request, response);

    
    
  }
}
