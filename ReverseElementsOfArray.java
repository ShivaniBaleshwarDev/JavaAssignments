package assignment1;

import java.util.Scanner;

public class ReverseElementsOfArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an Array");
		int num=sc.nextInt();
		int []arr= new int[num];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<num;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Reversed array elements of the array");
		for(int j=num-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
		}
	}

}
