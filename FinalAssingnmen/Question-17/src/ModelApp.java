import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
			 
	           stmt = connection.createStatement();
	        
	           String sql="SELECT * FROM blog";
			    rs = stmt.executeQuery(sql);
                 // System.out.println("Sid\tSNAME\tSAGE\tSADDRESS\tSGENDER");
			    while (rs.next()) {
			    	
			    	Dao d=new Dao();
			    	int id = (rs.getInt(1));
			    	d.setBlogId(id);
			    	String title = rs.getString(2);
			    	d.setTitle(title);
			   
			    	String des = rs.getString(3);
			    	d.setDescription(des);;
			    	String content = rs.getString(4);
			    	d.setContent(content);;
			    	
			    	list.add(d);
			    	
			    	//System.out.println(id+"\t"+title+"\t "+"\t  "+des+"\t         "+content);
					
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
		return list;
		
	}
	public static int Create(Dao d) {
		Connection connection=null;
		PreparedStatement stmt=null;
		//Dao d = new Dao();
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Load Sucessfully..........");
			String url="jdbc:mysql://localhost:3306/sourav";
			String user="root";
			String password="123456789";
			 connection = DriverManager.getConnection(url, user, password);
			 System.out.println("Connection Eastablished...........");
			 
			String sql="INSERT into blog (BlogTitle,BlogDescription,BlogContent) values (?,?,?)";
	           stmt = connection.prepareStatement(sql);
	            stmt.setString(1,d.getTitle() );
	            stmt.setString(2,d.getDescription());
	            stmt.setString(3,d.getContent());
	            
			     int i = stmt.executeUpdate();
                 
			    	return i;
			    	//System.out.println(id+"\t"+title+"\t "+"\t  "+des+"\t         "+content);
					
				
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
				
				stmt.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return 0;
	}
}
