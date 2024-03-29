

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title = request.getParameter("title");
		String des = request.getParameter("description");
		String con = request.getParameter("content");
		
		Dao dao = new Dao();
		dao.setTitle(title);
		dao.setDescription(des);
		dao.setContent(con);
		
		ModelApp app = new ModelApp();
		int i = app.Create(dao);
		
		PrintWriter out = response.getWriter();
		
		if(i!=0) {
			out.println("Record Inserted Sucessfully............");	
		}
		else {
			out.println("Record Insertion Failed...........");
		}
		
	}

}
