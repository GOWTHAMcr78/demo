package PostAssignment;

import java.util.Scanner;

public class sumofdigits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int result = sumOfDigits(number);
        System.out.println("Sum of digits: " + result);
    }

    public static int sumOfDigits(int n) {
        if (n == 0)
            return 0;
        else
            return (n % 10) + sumOfDigits(n / 10);
    
    }
}




