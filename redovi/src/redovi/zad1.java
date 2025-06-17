package redovi;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class zad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		double [] a=new double[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextDouble();		
	    }
		Queue<Double> red=new LinkedList<>();
		double suma=0;
		int maxi=0;
		double maxs=0;
		for(int i=0;i<n;i++) {
			suma+=a[i];
			red.add(a[i]);
			if(red.size()>k) {
				suma-=red.poll();
			}
			if(red.size()==k) {
				double avgs=suma/k;
				if (avgs >= maxs) { // >= да би ухватили последњи ако има више истих
                    maxs = avgs;
                    maxi = i - k + 1;
                }
				
			}
		}
		
		if (maxi + k <= n) {
		    System.out.print("Сегмент: ");
		    for (int i = maxi; i < maxi + k; i++) {
		        System.out.print(a[i] + " ");
		    }
		}
		
	}
	

}
