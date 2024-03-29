import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 11. Write a Java program that connects to a MySQL database using JDBC. The program
    should read data from a table and display the results in the console
 */
public class SelectApp {

	public static void main(String[] args) {
		Connection connection=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Load Sucessfully..........");
			String url="jdbc:mysql://localhost:3306/sourav";
			String user="root";
			String password="123456789";
			 connection = DriverManager.getConnection(url, user, password);
			 System.out.println("Connection Eastablished...........");
			 
	           stmt = connection.createStatement();
	        
	           String sql="SELECT * FROM student";
			    rs = stmt.executeQuery(sql);
                  System.out.println("Sid\tSNAME\tSAGE\tSADDRESS\tSGENDER");
			    while (rs.next()) {
			    	
			    	int id = rs.getInt(1);
			    	String sname = rs.getString(2);
			    	int sage = rs.getInt(3);
			    	String saddress = rs.getString(4);
			    	String sgender = rs.getString(5);
			    	
			    	System.out.println(id+"\t"+sname+"\t "+sage+"\t  "+saddress+"\t         "+sgender);
					
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
				rs.close();
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
