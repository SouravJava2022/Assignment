package in.ineuron.Main;

import java.util.Scanner;

import in.ineuron.Controller.ControllerApp;

/*
 * 12. Write a Java program that uses JDBC to implement a simple CRUD (create, read,
    update, delete) application. The program should allow users to add, view, update,
       and delete records in a MySQL database table.
 */
public class Instractor {

	public static void main(String[] args) {
		OptionControll();
		

	}
	public static void OptionControll() {
      int i = ControllerApp.getCommonMethod();
		
		switch (i) {
		case 1: {
			 ControllerApp.AddApp();
			 ControllerApp.getCommonMethod2();
			break;
		}
		case 2: {
			   ControllerApp.ViewApp();
			   ControllerApp.getCommonMethod2();
			   
			break;
		}
		case 3: {
			ControllerApp.upDate();
			ControllerApp.getCommonMethod2();
			
			break;
		}
		case 4: {
			ControllerApp.deLete();
			ControllerApp.getCommonMethod2();
			
			break;
		}
		default:System.out.println("Please Enter right Option");
			
		}
	}

}
