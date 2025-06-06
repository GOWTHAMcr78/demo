package session2;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class task2 {
	
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("How many numbers you want to enter? ");
	        int n = scanner.nextInt();

	        Integer[] a = new Integer[n];

	        for (int i = 0; i < n; i++) {
	            System.out.print("Enter number: ");
	            a[i] = scanner.nextInt();
	        }

	        System.out.println("\na = " + Arrays.toString(a));

	        Integer[] b = a.clone(); 
	        Arrays.sort(b, Collections.reverseOrder());
	        System.out.println("Descending order:");
	        System.out.println("b = " + Arrays.toString(b));

	        scanner.close();
	    }
}
	        
	   




