package ProducerConsumerproblem;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

	
private BlockingQueue bq;
	
	Consumer(BlockingQueue bq)
	{
		this.bq=bq;
	}
	
	@Override
	public void run() {
		while(true){
			try{
				System.out.println("item taken is "+bq.take());;
				
				
			}catch(Exception ex){
				
			}
			
		}

	}

}
