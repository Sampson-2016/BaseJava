package edu.njust.thinkThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread  extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		throw new RuntimeException();
		
	}
	
	public static void main(String[] args) {
		//ExecutorService ex= Executors.newCachedThreadPool(new HandlerThreadFactory());
		ExecutorService ex=Executors.newCachedThreadPool();
		Thread.setDefaultUncaughtExceptionHandler(new MyUncaught());

		ex.execute(new ExceptionThread());
		try {
			sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread.setDefaultUncaughtExceptionHandler(null);	
		new ExceptionThread().start();
	}
}
