package edu.njust.myThread;
/**
 * @author dky

 * @date 2017-2-17
 * @function �ػ����
 * @versions 1.0 
 */
public class ThreadDemo extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" :begin");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+" :end");
	}
	
	public static void main(String[] args) {
		System.out.println("test : begin"); 
		ThreadDemo threadDemo=new ThreadDemo();
		threadDemo.setDaemon(true);                           
		threadDemo.start();
		System.out.println("test : end"); 
	}
}
