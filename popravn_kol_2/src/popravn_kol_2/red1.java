package popravn_kol_2;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class red1 {

  public static void segmentduzinek(int n,int k,int []a) {
	Queue<Integer> red=new LinkedList<>();
	for(int i=0;i<n;i++) {
		red.add(a[i]);
	}
	int j=1;
	int t=red.poll();
	while(!red.isEmpty()) {
		if(j%k!=0) {
			red.poll();
		}
		else {
			t=red.poll();
		}
		j++;
	}
	System.out.println(t);
  }
  // 1 2 3 4 5 6 7
  public static void najprosjeksegmenta(int n,int k,double []a) {
	  Queue<Double> red=new LinkedList<>();
		double suma=0;
		int maxi=0;
		double maxa=0;
		for(int i=0;i<n;i++) {
			suma+=a[i];
			red.add(a[i]);
			if(red.size()>k) {
				suma-=red.poll();
			}
			if(red.size()==k) {
				double avgs=suma/k;
				if (avgs >= maxa) { 
                  maxa = avgs;
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
		System.out.println(maxi);
  }
  public static void poslednjihklinija() {
	  Scanner sc=new Scanner(System.in);
	  Queue<String> red=new LinkedList<>();
	  int k=sc.nextInt();
	  sc.nextLine();
	  while(sc.hasNextLine()) {
		  String linija=sc.nextLine();
		  if(linija.isEmpty()) {
			  break;
		  }
		  red.add(linija);
	  }
	  int n=red.size();
	  for(int i=0;i<n-k;i++) {
		  red.poll();
	  }
	  while(!red.isEmpty()) {
		  System.out.println(red.poll());
	  }
  }
  public static void sortiranje(int n,int []a) {
	  Queue<Integer> q1=new LinkedList<>();
	  Queue<Integer> q2=new LinkedList<>();
	  int p=0;
	  while(p+1<n && a[p]<a[p+1]) {
		  p++;
	  }
	  for(int i=0;i<p;i++) {
		  q1.add(a[i]);
	  }
	  for(int i=p;i<n;i++) {
		  q2.add(a[i]);
	  }
	  Queue<Integer> rezultat = new LinkedList<>();
	  while (!q1.isEmpty() && !q2.isEmpty()) {
          if (q1.peek() < q2.peek()) {
        	  rezultat.add(q1.poll());
          }
          else {
        	  rezultat.add(q2.poll());
          }
      }
	  while (!q1.isEmpty()) rezultat.add(q1.poll());
      while (!q2.isEmpty()) rezultat.add(q2.poll());
      while(!rezultat.isEmpty()) {
    	  System.out.println(rezultat.poll());
      }
  }
  public static void josifov(int n,int m) {
	  Queue<Integer> q = new LinkedList<>();
	  for(int i=0;i<n;i++) {
		  q.add(i);
	  }
	  int j=1;
	  while(q.size()>1) {
		  if(j%m==0) {
			  q.poll();
		  }
		  else {
			  q.add(q.poll());
		  }
		  j++;
	  }
	  System.out.println(q.peek());
  }
  public static void kruzna_lista(String s) {
	  Queue<Integer> q = new LinkedList<>();
	  int t=1;
	  int i=0;
	  while(i<s.length()) {
		  if(s.charAt(i)=='u') {
			  q.add(t);
			  int n=q.size();
			  for(int k=0;k<n-1;k++) {
				  q.add(q.poll());
			  }
			  t++;
		  }
		  if(s.charAt(i)=='s') {
			  q.add(q.poll());
		  }
		  if(s.charAt(i)=='i') {
			  q.poll();
			  int m=q.size();
			  for(int l=0;l<m-1;l++) {
				  q.add(q.poll());
			  }
		  }
		  i++;
	  }
	  
  }
  public static void prosti(int n) {
	  Queue<Long> dvojke = new LinkedList<>();
	  Queue<Long> trojke = new LinkedList<>();
	  Queue<Long> petice = new LinkedList<>();
	  dvojke.add(2L);
	  trojke.add(3L);
	  petice.add(5L);
	  long najmanji=1L;
	  for(int i=0;i<n;i++) {
		  najmanji=Math.min(dvojke.peek(),Math.min(trojke.peek(),petice.peek()));
		  
		  if(najmanji==dvojke.peek()) {
			  dvojke.poll();	  
		  }
		  if(najmanji==trojke.peek()) {
			  trojke.poll();
		  }
		  if(najmanji==petice.peek()) {
			  petice.poll();
		  }
		  dvojke.add(2*najmanji);
		  trojke.add(3*najmanji);
		  petice.add(5*najmanji);
	  }
	  System.out.println(najmanji);
  }
  
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    prosti(n);
//  double []a=new double[n];
//  for(int i=0;i<n;i++) {
//	  a[i]=sc.nextDouble();
//  }
//  //segmentduzinek(n,k,a);
//  najprosjeksegmenta(n,k,a);
//  poslednjihklinija();
//    int n=sc.nextInt();
//    int m=sc.nextInt();
//    josifov(n,m);
    
 }
}
