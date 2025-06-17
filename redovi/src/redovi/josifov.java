package redovi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class josifov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		Queue<Integer> red=new LinkedList<>();
		for(int i=0;i<n;i++) {
			red.add(i);		
	    }
		int j=0;
		while(red.size()>1) {
			j++;
			if(j==k) {
				red.poll();
				j=0;
			}
			else {
				red.add(red.poll());
			}
		}
		 System.out.println("Pobednik je: " + red.peek());
       
	}

}
