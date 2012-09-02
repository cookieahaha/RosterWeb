package me.kukkii.roster;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SortServlet
 */
@WebServlet("/SortServlet")
public class SortServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SortServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      final String sortType = request.getParameter("sortType");
      
      Player[] all = Roster.getRoster().getAll();
      Arrays.sort(all, new Comparator<Player>() {
        public int compare(Player a, Player b){
          if(sortType.equals("first")){
            return a.getFirstName().compareTo(b.getFirstName());
          }
          else if(sortType.equals("last")){
            return a.getLastName().compareTo(b.getLastName());            
          }
          else if(sortType.equals("number")){
            return a.getNumber().compareTo(b.getNumber());
          }
          else if(sortType.equals("position")){
            return a.getPosition().compareTo(b.getPosition());
          }
          else if(sortType.equals("battingAverage")){
            return (int)(a.getBattingAverage() - b.getBattingAverage());
          }
          else if(sortType.equals("homeTown")){
            return a.getHomeTown().compareTo(b.getHomeTown());
          }
          else if(sortType.equals("highSchool")){
            return a.getHighSchool().compareTo(b.getHighSchool());
          }
          else{
            return 0;
          }
        }
      }
     );

      request.setAttribute("array", all);
      ServletContext sc = getServletContext();
      RequestDispatcher rd = sc.getRequestDispatcher("/showAll.jsp");
      rd.forward(request, response);
  }
    
}
