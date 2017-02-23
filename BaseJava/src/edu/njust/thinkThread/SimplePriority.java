package edu.njust.thinkThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriority implements Runnable{
	private int countDown=5;
	private volatile double d;
//	private int priority;
	
/*	public SimplePriority(int priority){
		this.priority=priority;
	}*/
	
	
	public String toString() {
		return Thread.currentThread().getName()+":"+countDown;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
//		Thread.currentThread().setPriority(priority);
		while(true){
			for(int i=0;i<10000;i++){
				d+=(Math.PI+Math.E)/(double)i;
				if(i%1000==0){
					Thread.yield();
				}
				
			}
			System.out.println(this+"---------------");
			if(--countDown==0){
				return;
			}
		}
		
	}
	public static void main(String[] args) {
		ExecutorService executorService=Executors.newCachedThreadPool(new SimpleThreadFactory(Thread.MAX_PRIORITY));
		for(int i=0;i<5;i++){
			executorService.execute(new SimplePriority());
		}
		executorService.execute(new SimplePriority());
		executorService.shutdown();
	}
}
