package assignment1;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the base of traingle");
		long base=sc.nextLong();
		System.out.println("Enter the height of traingle");
		long height=sc.nextLong();
		sc.close();
		System.out.println("The area of traingle is "+ 0.5*base*height);

	}

}
