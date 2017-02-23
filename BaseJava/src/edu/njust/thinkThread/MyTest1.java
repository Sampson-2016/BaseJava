package edu.njust.thinkThread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class MyTest1  extends TimerTask{
	private SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
	
	@Override
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����ʱ����"+sf.format(new Date()));
	}
}
