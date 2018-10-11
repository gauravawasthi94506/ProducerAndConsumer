package ProducerConsumerproblem;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	private BlockingQueue bq;
	
	Producer(BlockingQueue bq)
	{
		this.bq=bq;
	}
	
	
	@Override
	public void run() {
		try{
			for(int i=0;i<10;i++){
				System.out.println("Item added is"+i);
				bq.put(i);
				
			}
			
			
		}catch(Exception ex){
			
		}

	}

}
