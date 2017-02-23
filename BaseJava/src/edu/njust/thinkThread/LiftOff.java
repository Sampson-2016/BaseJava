package edu.njust.thinkThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class LiftOff implements Runnable {
	protected int countDown = 10;
	private static int taskCount = 0;
	private final int id = taskCount++;

	public LiftOff(int c) {
		// TODO Auto-generated constructor stub
		this.countDown = c;
	}

	public String Status() {
		return "#" + id + "(" + (countDown > 0 ? countDown : "Liftoff!") + "),";
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (countDown-- > 0) {
			System.out.print(Status());
			Thread.yield();
			// System.out.println("end:"+ countDown);
		}
	}

	public static void main(String[] args) {
		long begin=System.currentTimeMillis();
/*		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(new LiftOff(5));
			thread.start();
		}*/
		
		ExecutorService executorService=Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			executorService.execute(new LiftOff(i));
		}
		executorService.shutdown();
		long end=System.currentTimeMillis();
		System.out.println("time need:"+ (end-begin));
	}
}
