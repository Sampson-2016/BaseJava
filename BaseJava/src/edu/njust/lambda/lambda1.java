package edu.njust.lambda;

//简化创建线程
public class lambda1 extends Thread{
	public static void main(String[] args) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("hello");
			}
		}).start();



		new Thread(()-> System.out.println("hello dky")).start();



	}

}
