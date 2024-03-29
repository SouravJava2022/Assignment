/*
 * 13. Create a Java program that connects to a MySQL database and executes a
  batch update. The program should read the input data from a file and insert it into the
   database using JDBC batch updates.

 */
package in.ineuron.BatchUpdateUsingExcelSheet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BatchUpdate {

	public static void main(String[] args) {
		
		List<Dao> list = SelectExcel.Select();
		
		Connection connection=null;
		PreparedStatement stmt=null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Load Sucessfully..........");
			String url="jdbc:mysql://localhost:3306/sourav";
			String user="root";
			String password="123456789";
			 connection = DriverManager.getConnection(url, user, password);
			 
			
			 System.out.println("Connection Eastablished...........");
			 
			 
	           String sql ="insert into student3 (sid,sname,saddress) values(?,?,?)";
			stmt = connection.prepareStatement(sql);
	        
			
				  
				 for (Dao dao : list) {
					stmt.setInt(1,dao.getSid());
					stmt.setString(2,dao.getSname());
					stmt.setString(3,dao.getSaddress());
					
					System.out.println(dao.getSname()+dao.getSid()+dao.getSaddress());
					
					stmt.addBatch();
					
					Scanner scan = new Scanner(System.in);
					System.out.println("Are You Want To Continue Y/N");
					String next = scan.next();
					
					if(next.equalsIgnoreCase("N")) {
						break;
					}
					else {
						
					}
				}
			
			 
			 int[] is = stmt.executeBatch();
			 for (int i : is) {
				System.out.println(i);
			}
			 
			 System.out.println("Record Inserted Sucessfully.........");
	          
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
				
		       if(stmt!=null)
				stmt.close();
		       if(connection!=null)
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}


}
