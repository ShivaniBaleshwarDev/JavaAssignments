package assignment2;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2;i<=Math.sqrt(num);i++)
		{
			if(num%i==0)
			{
				flag = 1;
				System.out.println("It is not a prime number");
			}
		}
		if(flag!=1)
		{
			System.out.println("It is a prime number");
		}
	    

	}

}
