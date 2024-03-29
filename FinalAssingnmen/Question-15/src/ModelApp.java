import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 11. Write a Java program that connects to a MySQL database using JDBC. The program
    should read data from a table and display the results in the console
 */
public class ModelApp {

	public static List<Dao> View() {
		Connection connection=null;
		Statement stmt=null;
		ResultSet rs=null;
		
		List<Dao> list = new ArrayList();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Load Sucessfully..........");
			String url="jdbc:mysql://localhost:3306/sourav";
			String user="root";
			String password="123456789";
			 connection = DriverManager.getConnection(url, user, password);
			 System.out.println("Connection Eastablished...........");
			   if(connection!=null)
	           stmt = connection.createStatement();
	        
	           String sql="SELECT * FROM student";
	            if(stmt!=null) {
			    rs = stmt.executeQuery(sql);
	            }
                  System.out.println("Sid\tSNAME\tSAGE\tSADDRESS\tSGENDER");
                  if(rs!=null) {
			    while (rs.next()) {
			    	
			    	Dao d=new Dao();
			    	int id = (rs.getInt(1));
			    	d.setSid(id);
			    	String sname = rs.getString(2);
			    	d.setSname(sname);
			    	int sage = rs.getInt(3);
			    	d.setSage(sage);
			    	String saddress = rs.getString(4);
			    	d.setSaddress(saddress);
			    	String sgender = rs.getString(5);
			    	d.setSgender(sgender);
			    	
			    	list.add(d);
			    	
			    	System.out.println(id+"\t"+sname+"\t "+sage+"\t  "+saddress+"\t         "+sgender);
			    }
				}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(rs!=null)
				 rs.close();
				
				if(stmt!=null)
				stmt.close();
				
				if(connection!=null)
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
		
	}

}
