package assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class SortStringsArrayList {

	public static void main(String[] args) {
		ArrayList<String> ls=new ArrayList<String>();
		ls.add("Mango");
		ls.add("Grapes");
		ls.add("Pineapple");
		ls.add("Grapes");
		ls.add("Apple");
		ls.add("Pineapple");
		ls.add("Grapes");
		ls.add("Orange");
		ls.add("Grapes");
		System.out.println("Before Sorting");
		System.out.println(ls);
		Collections.sort(ls);
		System.out.println("After Sorting");
		System.out.println(ls);
	}

}
