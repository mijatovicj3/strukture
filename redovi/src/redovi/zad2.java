package redovi;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class zad2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int k = sc.nextInt(); 
	        Queue<String> red = new LinkedList<>();

	        while (sc.hasNextLine()) {
	            String linija = sc.nextLine();
	            red.add(linija);

	            if (red.size() > k) {
	                red.poll();
	            }
	        }
	        for (String linija : red) {
	            System.out.println(linija);
	        }
	}

}
