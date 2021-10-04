package assignment2;

import java.util.Scanner;

public class AverageOfNumbersInArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an Array");
		int num=sc.nextInt();
		int sum=0;
		int []arr= new int[num];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<num;i++)
		{
			
			arr[i] = sc.nextInt();
			sum = sum+arr[i];
		}
		System.out.println("Average of the digits in an array is "+sum/num);
		sc.close();

	}

}
