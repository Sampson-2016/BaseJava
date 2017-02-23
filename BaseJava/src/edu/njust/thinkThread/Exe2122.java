package edu.njust.thinkThread;




import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/**
 * 
 * @author sampson
 *
 */
public class Exe2122 implements Callable <String> {
	
	private final int n;
	public Exe2122(int n) {
		this.n=n;
	}
	
	public int fic(int n){
		if(n<=2)
			return 1;
		else {
			return fic(n-2)+fic(n-1);
		}
	}
	
	public String call() {
	
		int [] sequences=new int[n];
		for(int i=0;i<n;i++){
			sequences[i]=fic(i+1);
		}
		Integer sumInteger=0;
		for (int i = 0; i < sequences.length; i++) {
			sumInteger+=sequences[i];
		}
		return n+"："+sumInteger;
	}
	
	public static void main(String[] args) {
		ExecutorService ex=Executors.newCachedThreadPool();
		ArrayList<Future<String>> a=new ArrayList<Future<String>>();
		for(int i=1;i<10;i++){
			a.add(ex.submit(new Exe2122(i)));
		}
		for (Future<String> future : a) {
			try {
				System.out.println(future.get());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				ex.shutdown();
			}
		}
	}
}
