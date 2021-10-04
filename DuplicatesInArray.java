package assignment2;

import java.util.Scanner;

public class DuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements you want in an Array");
		int num=sc.nextInt();
		int []arr= new int[num];
		System.out.println("Enter the elements of the array");
		for(int i=0;i<num;i++)
		{
			
			arr[i] = sc.nextInt();
		}
		 for(int i = 0; i < arr.length; i++) {  
		        for(int j = i + 1; j < arr.length; j++) {  
		            if(arr[i] == arr[j])  {
		            	System.out.println("Duplicate Elements: "+ arr[j]+" ");
		            }
		        }
		 }
	}

}
