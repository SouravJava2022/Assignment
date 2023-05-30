package in.ineuron.JDBCUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
        static {
        	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        public static Connection getConnection() throws SQLException {
        	String url="jdbc:mysql://localhost:3306/sourav";
			String user="root";
			String password="123456789";
			 return  DriverManager.getConnection(url, user, password);
        }
       public static void CloseConnection(Statement stmt,ResultSet rs,Connection con) {
        	try {
        		if(rs!=null)
				rs.close();
        		if(stmt!=null)
				stmt.close();
        		if(con!=null)
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        
}
