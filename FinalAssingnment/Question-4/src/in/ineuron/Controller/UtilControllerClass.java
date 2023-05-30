package in.ineuron.Controller;

import java.util.Scanner;

public class UtilControllerClass {
	
	private UtilControllerClass() {}
	
	static Scanner scan = new Scanner(System.in);

	public static Integer CommonMethod() 
	{
		System.out.println("By Default Acc No is ::12");
		System.out.println("Please Enter AccNo--");
		Integer Acc = scan.nextInt();
		if(Acc==12) {
		System.out.println("Here 4 Option............ ");
		System.out.println("****************************");
		System.out.println("1.Deposit");
		System.out.println("2.WithDraw");
		System.out.println("3.CheckBalance");
		System.out.println("4.Quit");
		System.out.println("******************************");
		
		System.out.println("Please Enter Option_____");
		int option = scan.nextInt();
		
		return option;
		
	}
		else {System.out.println("Please Enter Right Account Number....");}
		return 0;
	}
	
	
	
	public static void commonMethod2() {
		System.out.println("Are You Want To Enter Other Option YES/NO");
		String string = scan.next();
		if(string.equalsIgnoreCase("YES")) {
			//CommonMethod();
			Return();	
		}
		else {
			System.out.println("Come Back Again........");
		}
	}
	
	
	private static int veee;
	
	public static void DepositMethod() {
		System.out.println("Please Enter Deposit Amount--");
		int DA = scan.nextInt();
		ControllerPrivateVariable.setVar(veee+DA);
		  veee = ControllerPrivateVariable.getVar();
	
		System.out.println("Total Amount In Account After Deposit:"+veee);
		commonMethod2();
	
		}
		
	
	public static void WithDrawMethod() {
		System.out.println("Please Enter WithDraw Amount--");
		Integer WA = scan.nextInt();
		if(veee <= 0 || (veee-WA)<=0) {
			System.out.println("Not Enough Balance. Please deposit balance.");
		}else {
		 veee=veee-WA;
		System.out.println("Total Balance In Account Available After Withdraw Is:"+veee);
		}
		commonMethod2();	
	}
	
	
	public static void CheckMethod() {
		System.out.println("Checking Balance Is:"+veee);
		commonMethod2();	
	}
	
	public static void QuitMethod() {
		
		System.out.println("Please Restart The Programme...........");
	}
	
	public static void Return() {
		// TODO Auto-generated method stub
			
		Integer option = CommonMethod();
			switch(option) {
			
			case 1:{
				
				UtilControllerClass.DepositMethod();
				break;
	      }
			case 2:{
			        UtilControllerClass.WithDrawMethod();
				break;
				}
			case 3:{
			UtilControllerClass.CheckMethod();
			
			break;
		}
			case 4:{
			UtilControllerClass.QuitMethod();
			break;
			}
		default:System.out.println("Please Enter Right Account No [OR] Right Option Which Is Display On The Console");
		}

      }
	
}
		
