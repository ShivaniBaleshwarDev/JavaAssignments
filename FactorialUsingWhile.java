package assignment1;

import java.util.Scanner;

public class FactorialUsingWhile {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		long num=sc.nextLong();
		sc.close();
		long num1=num;
		long fact=1;
		
		
		while(num1>0)
		{
			fact=fact*num1;
			num1--;
		}
		System.out.println("The factorial of " + num +" is " + fact);
	}

}
