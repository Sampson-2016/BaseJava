package edu.njust.myThread;

public class RuThread  implements Runnable{

	@Override
	public void run() {
		System.out.println("RuThread body");
		
	}
	
	public static void main(String[] args) {
		RuThread ruThread=new RuThread();
		Thread thread=new Thread(ruThread);
		thread.start();
	}
	
}
