package edu.njust.thinkThread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SleepingTask2 implements Runnable{
	private static Random random=new Random(5);
	private final int sleep_time=random.nextInt(10)+1;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("begin sleep-time:"+sleep_time);
		try {
			Thread.sleep(sleep_time*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("sleep time =" +sleep_time);
	}
	
	public static void main(String[] args) {
		ExecutorService service= Executors.newCachedThreadPool();
		for(int i=0;i<10;i++){
			service.execute(new SleepingTask2());
			Thread.yield();
		}
		
		service.shutdown();
	}
	
}
