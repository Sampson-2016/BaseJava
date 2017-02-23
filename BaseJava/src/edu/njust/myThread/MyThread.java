package edu.njust.myThread;

public class MyThread  extends Thread{
	public void run() {
		System.out.println("MyThread body");
	}
	
	public static void main(String[] args) {
		MyThread myThread=new MyThread();
		myThread.start();
	}
}
