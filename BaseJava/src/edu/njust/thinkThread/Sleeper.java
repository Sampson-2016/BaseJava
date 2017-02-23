package edu.njust.thinkThread;

import java.io.InterruptedIOException;

public class Sleeper extends Thread{
	private int duration;
    public	Sleeper(String name,int sleepTime){
		super(name);
		duration=sleepTime;
		start();
	}
    @Override
    public void run() {
    	// TODO Auto-generated method stub
    	try {
			sleep(duration);
		} catch (InterruptedException e) {
			// TODO: handle exception
			System.out.println(getName()+" was interrupted "+"isTnterrupted:"+isInterrupted());
			return;
		} 
    	System.out.println(getName()+" has awakened");
    }
}
