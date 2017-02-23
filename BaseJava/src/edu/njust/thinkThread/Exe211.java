package edu.njust.thinkThread;

public class Exe211 implements Runnable{
	private static int taskCount=0;
	private final  int id=taskCount++;
	
	
	public Exe211() {
		// TODO Auto-generated constructor stub
		System.out.println("id: "+id );
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("one:"+id);
		Thread.yield();
		System.out.println("two:"+id);
		Thread.yield();
		System.out.println("three:"+id);
		Thread.yield();
		System.out.println("Printer ended, ID = " + id);
	}
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++){
			Thread thread=new Thread(new Exe211());
			thread.start();
		}
	}
}
