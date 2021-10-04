package assignment1;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		long num=sc.nextLong();
		long first=0,sec=1,third;
		System.out.println("Fibonacci series until " + num + " is" );
		System.out.print(first+" "+sec);
		for(int i=2;i<= num; i++)
		{
			third=first+sec;
			System.out.print(" "+third+" ");
			first=sec;
			sec=third;
		}
	}

}
