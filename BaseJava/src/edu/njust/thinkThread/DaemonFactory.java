package edu.njust.thinkThread;

import java.util.concurrent.ThreadFactory;

public class DaemonFactory implements ThreadFactory {
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		
		
		Thread thread=new Thread(r);
	//	thread.setDaemon(true);
		return thread;
	}
}
