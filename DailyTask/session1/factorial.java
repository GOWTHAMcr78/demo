package session1;
import java.util.Scanner;
public class factorial {


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a non-negative integer: ");
	        int number = scanner.nextInt();

	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	        } else {
	            int result = factorial(number);
	            System.out.println("Factorial of " + number + " is: " + result);
	        }
	    }

	    public static int factorial(int n) {
	        if (n == 0 || n == 1)
	            return 1;
	        else
	            return n * factorial(n - 1);
	    }
	}


