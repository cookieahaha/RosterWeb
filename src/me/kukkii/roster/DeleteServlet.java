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
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      String last = request.getParameter("last");
      if(Roster.getRoster().lookUpPlayer(last) != null){
      
        Roster.getRoster().deletePlayer(last);
     
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/deleteConfirm.jsp");
        rd.forward(request, response);
      }
      else{
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/cantFind.html");
        rd.forward(request, response);
      }
    }
    
}
