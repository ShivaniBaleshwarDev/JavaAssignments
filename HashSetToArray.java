package assignment4;

import java.util.HashSet;
import java.util.Set;

public class HashSetToArray {
public static void main(String[] args) {
 Set hs= new HashSet();
 hs.add(15);
 hs.add(71);
 hs.add(82);
 hs.add(89);
 hs.add(91);
 hs.add(93);
 hs.add(97);
 System.out.println("Elements in a Set" + hs);
 System.out.println("Copying all elements");
 Object[] arr = hs.toArray();
 for(Object o:arr)
 {
	 System.out.println(o);
 }
}
}
