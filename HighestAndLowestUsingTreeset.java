package assignment4;

import java.util.TreeSet;

public class HighestAndLowestUsingTreeset {

	public static void main(String[] args) {
		TreeSet st= new TreeSet();
		st.add(50);
		st.add(400);
		st.add(10);
		st.add(100);
		st.add(7);
		st.add(300);
		st.add(0);
		st.add(-2);
		System.out.println("Highest Value "+st.last());
		System.out.println("Lowest Value "+st.first());
	}

}
