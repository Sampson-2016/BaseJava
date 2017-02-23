package edu.njust.thinkThread;

import java.util.concurrent.ThreadFactory;

public class HandlerThreadFactory implements ThreadFactory{
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(r);
		thread.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
		System.out.println(Thread.currentThread().getName()+" eh:"+thread.getUncaughtExceptionHandler());
		return thread;
	}
	
	public	class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
		@Override
		public void uncaughtException(Thread t, Throwable e) {
			// TODO Auto-generated method stub
			System.out.println("----");
			
		}
	}
}
