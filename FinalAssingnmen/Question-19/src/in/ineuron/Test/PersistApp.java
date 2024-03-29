/*
 * 19. Create a Java program that uses Hibernate to insert data into a MySQL database
    table. The program should use Hibernate to map the table to a Java object and then
     insert the data into the table. After inserting the data, the program should retrieve it
      from the database and display it on the console.
 */

package in.ineuron.Test;
import java.util.Scanner;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.ineuron.Util.HibernateUtil;
import in.ineuron.model.Student1;


public class PersistApp {

	public static void main(String[] args) {
		Session session=null;
		Transaction transaction=null;
		boolean flag=false;
		
	try {	
		 session = HibernateUtil.getSession();
          if(session!=null)
        	  transaction=session.beginTransaction();
          if(transaction!=null) {
			Student1 student = new Student1();
			student.setSid(8);
			student.setSname("Dhoni");
			//student.setSage(35);
			student.setSaddress("CSK");
			
			session.persist(student);
			flag=true;
          }
			
		}
	catch(HibernateException e) {
		e.printStackTrace();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	finally {
		if(flag) {
			transaction.commit();
		System.out.println("Object Saved To DataBase......");
		
		
		}
		else {
			System.out.println("Object Is not Saved database.......");
		}
		
	}
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Are You Want To Continue Y/N");
	String next = scan.next();
	if(next.equalsIgnoreCase("Y")) {
		GetRecordApp.getRecord();
	}
	else {
		System.out.println("Come Back Again.......");
	}
	HibernateUtil.closeSession(session);
	HibernateUtil.closeSessionFactory();
	
	
          
	}
}
