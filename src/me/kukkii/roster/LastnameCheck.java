package me.kukkii.roster;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class lastnameCheck
 */
@WebServlet("/lastnameCheck")
public class LastnameCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LastnameCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String last = request.getParameter("last");
      Player player = Roster.getRoster().lookUpPlayer(last);
      
      if(player == null){
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/cantFind.html");
        rd.forward(request, response);
      }
      else{
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/updateScreen.jsp");
        rd.forward(request, response);        
      }
    }
}
