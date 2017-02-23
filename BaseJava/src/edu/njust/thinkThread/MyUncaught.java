package edu.njust.thinkThread;

import java.util.concurrent.ThreadFactory;

public class MyUncaught implements Thread.UncaughtExceptionHandler {
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		System.out.println("----");
		
	}
}
