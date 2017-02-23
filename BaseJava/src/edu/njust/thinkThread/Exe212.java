package edu.njust.thinkThread;


import java.util.Arrays;

public class Exe212 implements Runnable {
	
	private final int n;
	public Exe212(int n) {
		this.n=n;
	}
	
	public int fic(int n){
		if(n<=2)
			return 1;
		else {
			return fic(n-2)+fic(n-1);
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int [] sequences=new int[n];
		for(int i=0;i<n;i++){
			sequences[i]=fic(i+1);
		}
		
		System.out.println("size："+n+Arrays.toString(sequences));
	}
	
	public static void main(String[] args) {
		for(int i=1;i<10;i++){
			new Thread(new Exe212(i)).start();;
		}
	}
}
