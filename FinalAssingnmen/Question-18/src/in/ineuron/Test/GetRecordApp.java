/*
 * 18. Create a Java program that uses Hibernate to connect to a MySQL database and
    retrieve data from a table. The program should use Hibernate to map the table to a
      Java object and then display the data on the console.
 */

package in.ineuron.Test;
import java.io.Serializable;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Util.HibernateUtil;
import in.ineuron.model.Student1;


public class GetRecordApp {

	public static void main(String[] args) {
		Session session=null;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please Enter Id Which is To be Serched::");
	     int id=scan.nextInt();
		
	try {	
		 session = HibernateUtil.getSession();
          if(session!=null) {
			Student1 student = session.get(Student1.class,id);
		         if(session!=null)
		        	 System.out.println(student);
		         else
		        	 System.out.println("Record not Found  in the given id::"+id);
          }
			
		}
	catch(HibernateException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
	
		HibernateUtil.closeSession(session);
	     HibernateUtil.closeSessionFactory();
	}
	
          
	}
}
