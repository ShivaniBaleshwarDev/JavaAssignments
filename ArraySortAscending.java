package assignment1;

import java.util.Scanner;

public class ArraySortAscending {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an Array");
		int num=sc.nextInt();
		int temp;
		int []arr= new int[num];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<num;i++)
		{
			
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Elements of the array after sorting is ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}
