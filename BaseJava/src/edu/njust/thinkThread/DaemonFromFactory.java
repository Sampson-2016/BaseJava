package edu.njust.thinkThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			while (true) {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread()+"---"+this);
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			System.out.println("hello -------------------------------------------");
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		ExecutorService executorService=Executors.newCachedThreadPool(new DaemonFactory());
		for (int i = 0; i <5; i++) {
			executorService.execute(new DaemonFromFactory());
		}
		System.out.println("All started");
		TimeUnit.MILLISECONDS.sleep(1000);
	}
}
