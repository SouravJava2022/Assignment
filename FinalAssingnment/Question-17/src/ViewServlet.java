/*
     17. Create a web application that lets users create and view blog posts. The web
  application should use the MVC pattern, with servlets as controllers, JSPs as views,
  and a database as the model. Users should be able to create new blog posts by
  filling out a form that includes a title, description, and content. The web application
  should use a servlet to store the blog post data in the database. Users should also be
  able to view all the blog posts on a separate page, and the web application should
  use a servlet to retrieve the blog post data from the database and display it in a
    formatted way.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/view")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		ModelApp app = new ModelApp();
		List<Dao> list = app.View();
		
		request.setAttribute("List",list);
		RequestDispatcher rd = request.getRequestDispatcher("ViewResult.jsp");
		rd.forward(request, response);
		
	}

}
