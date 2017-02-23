package edu.njust.other;

import java.util.ArrayList;
import java.util.List;

public class testLebal {
	public static void main(String[] args) {
		outer:
			for(int i=0;i<5;i++){
				for(int j=0;j<5;j++){
					
					if(j>=2)
						break outer;
					System.out.println(j);
				}
				System.out.println("outer i= "+i);
			}
	List<Integer> a=new ArrayList<Integer>();
	a.add(1);
	System.out.println(a.size());
	
	int b[]={1,2,3};
	System.out.println(b.length);
	
	String s=new String("Hello");
	System.out.println(s.length());
	
	
	}
}
