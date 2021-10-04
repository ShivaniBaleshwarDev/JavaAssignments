package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList ls= new ArrayList();
		ls.add(1);
		ls.add("hi");
		ls.add(4.5);
		ls.add(99999);
		ls.add("Java Program");
		System.out.println("Before Reversing");
		System.out.println(ls);
		Collections.reverse(ls);
		System.out.println("After Reversing");
		System.out.println(ls);
	}

}
