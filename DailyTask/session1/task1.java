package session1;

import java.util.Arrays;
import java.util.Scanner;

public class task1 {
	public static void main(String[] args) 

    {

        Scanner a = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");

        int n = a.nextInt();

        int[] array = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) 

        {

            array[i] = a.nextInt();

        }

        int max = array[0];

        int min = array[0];

        for (int i = 1; i < n; i++) 

        {

            if (array[i] > max) 

            {

                max = array[i];

            }

            if (array[i] < min) 

            {

                min = array[i];

            }

        }

        System.out.println("Maximum element: " + max);

        System.out.println("Minimum element: " + min);

        a.close();

    }



	

}


