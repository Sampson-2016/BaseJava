package edu.njust.cs;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {
	public static final String IP_ADDR = "localhost";//��������ַ 
	public static final int PORT = 12345;//�������˿ں�  
	
    public static void main(String[] args) {  
        System.out.println("�ͻ�������...");  
        System.out.println("�����յ����������ַ�Ϊ \"OK\" ��ʱ��, �ͻ��˽���ֹ\n"); 
        while (true) {  
        	Socket socket = null;
        	try {
        		//����һ�����׽��ֲ��������ӵ�ָ�������ϵ�ָ���˿ں�
	        	socket = new Socket(IP_ADDR, PORT);  
	              
	            //��ȡ�����������  
	            DataInputStream input = new DataInputStream(socket.getInputStream());  
	            //��������˷������  
	            DataOutputStream out = new DataOutputStream(socket.getOutputStream());  
	            System.out.print("������: \t");  
	            String str = new BufferedReader(new InputStreamReader(System.in)).readLine();  
	            out.writeUTF(str);  
	              
	            String ret = input.readUTF();   
	            System.out.println("�������˷��ع�������: " + ret);  
	            // ����յ� "OK" ��Ͽ�����  
	            if ("OK".equals(ret)) {  
	                System.out.println("�ͻ��˽��ر�����");  
	                Thread.sleep(500);  
	                break;  
	            }  
	            
	            out.close();
	            input.close();
        	} catch (Exception e) {
        		System.out.println("�ͻ����쳣:" + e.getMessage()); 
        	} finally {
        		if (socket != null) {
        			try {
						socket.close();
					} catch (IOException e) {
						socket = null; 
						System.out.println("�ͻ��� finally �쳣:" + e.getMessage()); 
					}
        		}
        	}
        }  
    }  
}  