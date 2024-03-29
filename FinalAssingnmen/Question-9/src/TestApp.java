import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/*
 *  9. Write a Java program that implements a producer-consumer model using
       multithreading. The program should have a producer thread that generates random
       numbers and adds them to a queue, and a consumer thread that reads numbers
       from the queue and calculates their sum. The program should use synchronization to
       ensure that the queue is accessed by only one thread at a time.
 */

class Producer extends Thread{
  
     private Queue list;

	public Producer(Queue list) {
    	 this.list=list;
		
	}

	@Override
	public void run() {
		synchronized (list) {
			System.out.println("************************************");
			for(int j=0;j<10;j++) {
				list.add(j);
				list.notify();
			}
			System.out.println("***********"+list);
		}
    	 System.out.println("List Items::"+list);
}
}
class Consumer extends Thread{


	private Queue list;
	

	public Consumer(Queue list) {
		this.list=list;
		
	}

	@Override
	public void run() {
		 Integer k=0;
		synchronized(list) {
			if(list.isEmpty()) {
				try {
					System.out.println("////////////////////////////");
					list.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				Iterator it = list.iterator();
				while(it.hasNext()) {
					Integer next = (Integer) it.next();
					//System.out.println("Objects Are::"+next);
					k+=next;
				}
				System.out.println("Sum of All Elements::"+k);
			}
		}
	}	
}
	 
public class TestApp {

	public static void main(String[] args) {
	Queue<Integer> list = new LinkedList();
	
	Producer P = new Producer(list);
	Consumer C = new Consumer(list);
	P.start();
	C.start();
	System.out.println("Main Thread");
	}
}

