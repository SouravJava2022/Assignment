/*
 * 8. Write a Java program that creates two threads. The first thread should print even
   numbers between 1 and 10, and the second thread should print odd numbers
    between 1 and 10.
 */
 class MyThread extends Thread{
	   
	 public static Thread mt;
	 @Override
	 public void run() {
	      try {
			mt.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 for(int i=0;i<10;i++) {
			 
		 System.out.println("Odd Numbers Are::"+(i+1));
		 i++;
	 }
	 }
}
public class TestApp  {

	public static void main(String[] args) {
		MyThread.mt=Thread.currentThread();
		MyThread thread = new MyThread();
		
		thread.start();
			
	    for(int i=0;i<10;i++) {
		System.out.println("Even Number::"+(i+2));
		    i++;
	    }
		}
	}


