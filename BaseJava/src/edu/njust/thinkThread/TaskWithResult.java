package edu.njust.thinkThread;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TaskWithResult implements Callable<String> {
	private int id;
	public TaskWithResult(int id ) {
		// TODO Auto-generated constructor stub
		this.id=id;
	} 
	
	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "result with id:"+id;
	}
	
	public static void main(String[] args) {
		ExecutorService ex=Executors.newCachedThreadPool();
		ArrayList<Future<String>> arrayList=new ArrayList<Future<String>>();
		
		for (int i = 0; i <5; i++) {
			arrayList.add(ex.submit(new TaskWithResult(i)));
		}
		
		for(Future<String> future:arrayList){
			try {
				System.out.println(future.get());
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}catch (ExecutionException e) {
				// TODO: handle exception
				e.printStackTrace();
			}finally{
				ex.shutdown();
			}
		}
	}
	
}
