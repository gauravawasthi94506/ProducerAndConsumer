package ProducerConsumerproblem;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
	

	public static void main(String args[])
	{
		BlockingQueue sharedQueue = new LinkedBlockingQueue();
		Thread th1=new Thread(new Producer(sharedQueue)); 
		Thread th2=new Thread(new Consumer(sharedQueue)); 
		th1.start();
		th2.start();
				
		
	}
}
