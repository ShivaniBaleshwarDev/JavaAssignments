package assignment3;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str =sc.nextLine();
		String rev = "";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println(str+" is a palindrome");
		}
		else {
			System.out.println(str+" is not a palindrome");
		}
	}

}
