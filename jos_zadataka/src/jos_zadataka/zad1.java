package jos_zadataka;
import java.util.LinkedList;
import java.util.Queue;
public class zad1 {
	public static int getNthHammingNumber(int n) {
		Queue<Long> broj2=new LinkedList<>();
		Queue<Long> broj3=new LinkedList<>();
		Queue<Long> broj5=new LinkedList<>();
		broj2.add(2L);
		broj3.add(2L);
		broj5.add(2L);
	    long trenutni=1;
	    for(int i=1;i<n;i++) {
	    	long max2=broj2.peek();
	    	long max3=broj3.peek();
	    	long max5=broj5.peek();
	    	
	    	trenutni=Math.min(max2, Math.min(max3, max5));
	    	if(trenutni==max2) {
	    		broj2.remove();
	    		broj2.add(trenutni*2);
	    		broj2.add(trenutni*3);
	    		broj2.add(trenutni*5);
	    		}
	    	if(trenutni==max3) {
	    		broj3.remove();
	    		broj3.add(trenutni*3);
	    		broj3.add(trenutni*5);
	    		}
	    	if(trenutni==max5) {
	    		broj5.remove();
	    		broj5.add(trenutni*5);
	    		}
	    	
	    }
	    return (int)trenutni;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
