/*
 * 15. Write a Java servlet that reads the data from a MySQL database table and displays it
    in an HTML table on the web page. The servlet should use JDBC to connect to the
     database and retrieve the data.

 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		ModelApp app = new ModelApp();
		List<Dao> list = app.View();
		
		//Dao d=new Dao();
		//out.println(d.getSaddress());
		out.println("<html>");
		out.println("<head>");
		out.println("<title>View</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>SID</th>");
		out.println("<th>SNAME</th>");
		out.println("<th>SAGE</th>");
		out.println("<th>SADDRESS</th>");
		out.println("<th>SGENDER</th>");
		for (Dao d : list) {
			out.println("<tr>");
			
			out.println("<td>"+d.getSid());
			out.println("</td>");
			out.println("<td>"+d.getSname());
			out.println("</td>");
			out.println("<td>"+d.getSage());
			out.println("</td>");
			out.println("<td>"+d.getSaddress());
			out.println("</td>");
			out.println("<td>"+d.getSgender());
			out.println("</td>");
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");
	}

}
