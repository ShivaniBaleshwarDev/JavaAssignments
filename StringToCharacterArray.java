package assignment3;

import java.util.Scanner;

public class StringToCharacterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a String");
		String str =sc.nextLine();
		char []strarray = new char[str.length()];
		String str2 = "";
		System.out.println("String to Character array is ");
		for(int i=0;i<str.length();i++)
		{
		strarray[i]=str.charAt(i);
		
		System.out.print(strarray[i] + ", ");
		str2=str2+strarray[i];
		}
		System.out.println("Charater array to string is "+ str2);
	}

}
