package edu.njust.thinkThread;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadFactory;

public class SimpleThreadFactory  implements ThreadFactory{
	private int  priority;
	public SimpleThreadFactory(int  priority) {
		// TODO Auto-generated constructor stub
		this.priority=priority;
	}
	
	
	
	@Override
	public Thread newThread(Runnable r) {
		// TODO Auto-generated method stub
		Thread thread=new Thread(r);
		thread.setPriority(priority);
		return thread;
	}

}
