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
 * Servlet implementation class Control
 */
@WebServlet("/Control")
public class Control extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Control() {
        super();
        // TODO Auto-generated constructor stub
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      String action = request.getParameter("action");

      if((action.equals("list")) || (action == null) ){
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/showAll.jsp");
        rd.forward(request, response);
      }
      if(action.equals("read")){
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/add");
        rd.forward(request, response);
      }
      if(action.equals("delete")){
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/DeleteServlet");
        rd.forward(request, response);
      }
      if(action.equals("update")){
        ServletContext sc = getServletContext();
        RequestDispatcher rd = sc.getRequestDispatcher("/lastnameCheck");
        rd.forward(request, response);
      }
    }

}
