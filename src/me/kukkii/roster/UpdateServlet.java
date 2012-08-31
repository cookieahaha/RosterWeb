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
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

        String first = request.getParameter("first");
        String last = request.getParameter("last");
        String number = request.getParameter("number");
        String position = request.getParameter("position");
        double battingAverage = Double.parseDouble(request.getParameter("battingAverage"));
        String hometown = request.getParameter("hometown");
        String highSchool = request.getParameter("highSchool");

        String oldLast = request.getParameter("oldLast");
        Roster.getRoster().deletePlayer(oldLast);
     
        Player player = new Player(first, last, number, position, battingAverage, hometown, highSchool);
        Roster.getRoster().addPlayer(last, player);
      
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/updateConfirm.jsp");
        rd.forward(request, response);
    }
      
}
