package edu.njust.thinkThread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class traditionalThreadcommunication {
	public static void main(String[] args) {
		//����һ���̳߳أ�������ڶ���߳�
		ExecutorService threadPool = Executors.newCachedThreadPool();
		//���̷߳ŵ�threadPool����
	/*	Thread t1=new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new Timer().schedule(new TimerTask(){
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("boming!"+Thread.currentThread().getName());
					}
				}, 1000,1000);
			}
			
		});
		threadPool.execute(t1);*/
		//��execute��������ֱ���ع�runnable�������Ƚϼ򵥣����Һ������һ��
		threadPool.execute(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//ʹ�ô�ͳ�ķ������嶨ʱ��Timer������schedule����ʵ�ֶ�ʱ������
				new Timer().schedule(new TimerTask(){
					@Override
					public void run() {
						// TODO Auto-generated method stub
						System.out.println("boming!"+Thread.currentThread().getName());
					}
				}, 1000,1000);
			}
			
		});
		
		//ʹ��newScheduledThreadPool�̳߳ض��嶨ʱ������������߳���Ϊ3,ʹ���ĸ��̣߳����һ���̵߳ȴ���ɺ���õ�һ����ɵ�������߳�
		ScheduledExecutorService schedulePool=Executors.newScheduledThreadPool(3);
		schedulePool.scheduleAtFixedRate( new Runnable(){

			@Override
			public void run() {
				System.out.println("this is "+Thread.currentThread().getName());
			}
			
		}, 1, 2, TimeUnit.SECONDS);
		schedulePool.scheduleAtFixedRate( new Runnable(){

			@Override
			public void run() {
				System.out.println("this is "+Thread.currentThread().getName());
			}
			
		}, 1, 2, TimeUnit.SECONDS);
		schedulePool.scheduleAtFixedRate( new Runnable(){

			@Override
			public void run() {
				System.out.println("this is "+Thread.currentThread().getName());
			}
			
		}, 1, 2, TimeUnit.SECONDS);
		schedulePool.scheduleAtFixedRate( new Runnable(){

			@Override
			public void run() {
				System.out.println("this is "+Thread.currentThread().getName());
			}
			
		}, 1, 2, TimeUnit.SECONDS);
		schedulePool.scheduleAtFixedRate( new Runnable(){

			@Override
			public void run() {
				System.out.println("this is "+Thread.currentThread().getName());
			}
			
		}, 1, 2, TimeUnit.SECONDS);
		
		
		
		//��ʹ��һ���̵߳�newScheduleTreadPool
		/*Executors.newScheduledThreadPool(1).scheduleAtFixedRate(new Runnable(){
		
			@Override
			public void run() {
				System.out.println("boming2!"+Thread.currentThread().getName());
				
			}
			
		},3, 2, TimeUnit.SECONDS);*/

		
		while(true){
			try {
				new Thread().sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(new Date().getSeconds());
		}
	}
}
