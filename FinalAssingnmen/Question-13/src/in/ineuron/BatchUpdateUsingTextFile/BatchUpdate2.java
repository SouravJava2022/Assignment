package in.ineuron.BatchUpdateUsingTextFile;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class BatchUpdate2 {

	public static void main(String[] args) {
		
		//List<Dao> list = SelectExcel.Select();
		
		Connection connection=null;
		PreparedStatement stmt=null;
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Class Load Sucessfully..........");
			String url="jdbc:mysql:///sourav";
			String user="root";
			String password="123456789";
			 connection = DriverManager.getConnection(url, user, password);
			 
	
			 System.out.println("Connection Eastablished...........");
			 
			 
	           String sql ="insert into student3 (sid,sname,saddress) values(?,?,?)";
			stmt = connection.prepareStatement(sql);
	        
			BufferedReader br = new BufferedReader(new FileReader(new File("F:\\Java live Class Projects\\Assingn\\Question-13\\data.txt")));
				  
				 while (true) {
					 System.out.println("enter id");  
					 String s1=br.readLine();  
					 int id=Integer.parseInt(s1);  
					   
					 System.out.println("enter name");  
					 String name=br.readLine();  
					   
					 System.out.println("enter address");  
					 String s3=br.readLine();  
					 //int salary=Integer.parseInt(s3);
					 
					 stmt.setInt(1,id);
					 stmt.setString(2,name);
					 stmt.setString(3,s3);
					
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
