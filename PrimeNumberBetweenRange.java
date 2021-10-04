package assignment1;

import java.util.Scanner;

public class PrimeNumberBetweenRange {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int flag=0,a,b,i,j;
		System.out.println("Enter the starting number");
		a = sc.nextInt();
		System.out.println("Enter the ending number");
		b = sc.nextInt();
		for (i = a; i <= b; i++) {
	        // Skip 0 and 1 as they are
	        // neither prime nor composite
	        if (i == 1 || i == 0)
	            continue;
	 
	        // flag variable to tell
	        // if i is prime or not
	        flag = 1;
	 
	        for (j = 2; j <= i / 2; ++j) {
	            if (i % j == 0) {
	                flag = 0;
	                break;
	            }
	        }
	 
	        // flag = 1 means i is prime
	        // and flag = 0 means i is not prime
	        if (flag == 1)
	            System.out.println(i+" "); 
	    }
	}
	}

