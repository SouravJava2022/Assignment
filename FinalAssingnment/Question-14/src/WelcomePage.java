/*
 * 14. Create a Java servlet that reads the name of the user from a form and displays a
       welcome message on the web page. The servlet should use the GET method to read
     the input data from the user
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomePage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String parameter = request.getParameter("username");
		
		out.println("Welcome To Servlet Programming:"+parameter);
	}

}
