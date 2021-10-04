package assignment1;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		sc.close();
		System.out.println("The Sum Of first 20 Natural Numbers are "+ num*(num+1)/2);
	}

}
