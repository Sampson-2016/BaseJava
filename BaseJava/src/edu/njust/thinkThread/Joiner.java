package edu.njust.thinkThread;
/**
 * 
 * @author sampson
 *t.join() 会在t完成后，其外部的线程才能继续
 *t.join(1000),在1秒后，外部线程继续运行，即使t还没有结束；若t在<1000结束，外部在t结束时继续运行
 */
public class Joiner extends Thread{
	private Sleeper sleeper;
	public Joiner(String name,Sleeper sleeper) {
		// TODO Auto-generated constructor stub
		super(name);
		this.sleeper=sleeper;
		start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			sleeper.join(5000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println("InterruptedException");
		}
		System.out.println(getName()+ " join campleted");
	}
	
	public static void main(String[] args) {
		Sleeper sleeper=new Sleeper("Sleepy", 1500);
		Sleeper grumpy =new Sleeper("Grumpy", 1500);
		Joiner dopey = new Joiner("Dopey", sleeper),
				docJoiner=new Joiner("Doc", grumpy);
		sleeper.interrupt();
	}
}
