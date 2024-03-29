package in.ineuron.Controller;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import in.ineuron.JDBCUtil.Util;
import in.ineuron.Main.Instractor;


public class ControllerApp {
	
	public static int getCommonMethod() {
		System.out.println(" Options Are.............");
		System.out.println("1.ADD");
  		System.out.println("2.VIEW");
		System.out.println("3.UPDATE");
		System.out.println("4.DELETE");
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Please Enter Options.............");
		int i = scan.nextInt();
		return i;
	}
	public static void getCommonMethod2() {
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Are You Want To Continue Y/N");
		    
		    String string = scan.next();
		    
		    if(string.equalsIgnoreCase("Y")) {
		    	// getCommonMethod();
		    	//return i;
		    	Instractor.OptionControll();
		    }
		    else {
		    	System.out.println("Choose Right Option............");
		    }
	}
	
	public static void AddApp() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please Enter Name::");
		 String name = scan.next();
		 System.out.println("Please Enter Age::");
		 int Age = scan.nextInt();
		 System.out.println("Please Enter Address::");
		 String Address = scan.next();
		 System.out.println("Please Enter Gender::");
		 String gender = scan.next();
		 
		 Connection connection=null;
			PreparedStatement stmt=null;
			ResultSet rs=null;
			try {
				connection=Util.getConnection();
				
				String sql="INSERT into student (sname,sage,saddress,sgender) values(?,?,?,?)";
				if(connection!=null)
				stmt = connection.prepareStatement(sql);
				
				if(stmt!=null) {
				stmt.setString(1,name);
				stmt.setInt(2,Age);
				stmt.setString(3,Address);
				stmt.setString(4,gender);
				
				int i = stmt.executeUpdate();
				
				System.out.println("Row Effected::"+i);
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				Util.CloseConnection(stmt, rs, connection);
			}
		
	}
	
	public static void ViewApp() {
		Connection connection=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			connection=Util.getConnection();
			if(connection!=null)
			stmt = connection.createStatement();
			
			String sql="SELECT * FROM student";
			if(stmt!=null)
			rs = stmt.executeQuery(sql);
			
			System.out.println("Sid\tSNAME\tSAGE\tSADDRESS\tSGENDER");
			if(rs!=null) {
			while (rs.next()) {
				
				int id = rs.getInt(1);
				String sname = rs.getString(2);
				int sage = rs.getInt(3);
				String saddress = rs.getString(4);
				String sgender = rs.getString(5);
				
				System.out.println(id+"\t"+sname+"\t "+sage+"\t  "+saddress+"\t         "+sgender);
			}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			Util.CloseConnection(stmt, rs, connection);
		}
	}	
	
	public static void upDate() {
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please Enter Id Where To be Update::");
		 int Id = scan.nextInt();
		 System.out.println("Please Enter Name::");
		 String name = scan.next();
		 System.out.println("Please Enter Age::");
		 int Age = scan.nextInt();
		 System.out.println("Please Enter Address::");
		 String Address = scan.next();
		 System.out.println("Please Enter Gender::");
		 String gender = scan.next();
		 
		 Connection connection=null;
			PreparedStatement stmt=null;
			ResultSet rs=null;
			try {
				connection=Util.getConnection();
				
				String sql="UPDATE student SET sname =?,sage = ?,saddress =?,sgender =? WHERE id = ?";
				if(connection!=null)
				stmt = connection.prepareStatement(sql);
				
				if(stmt!=null) {
				stmt.setString(1,name);
				stmt.setInt(2,Age);
				stmt.setString(3,Address);
				stmt.setString(4,gender);
				stmt.setInt(5,Id);
				
				
				int i = stmt.executeUpdate();
				
				System.out.println("Row Effected::"+i);
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				Util.CloseConnection(stmt, rs, connection);
			}
	}
	public static void deLete() {
		
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Please Enter Id Where To be deleted::");
		 int Id = scan.nextInt();
		 
		 Connection connection=null;
			PreparedStatement stmt=null;
			ResultSet rs=null;
			try {
				connection=Util.getConnection();
				
				String sql="DELETE FROM student where Id=?";
				if(connection!=null)
				stmt = connection.prepareStatement(sql);
				
				if(stmt!=null) {
				stmt.setInt(1,Id);
				
				
				
				int i = stmt.executeUpdate();
				
				System.out.println("Row Effected::"+i);
				
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				Util.CloseConnection(stmt, rs, connection);
			}
	}
	
	}


