package assignment4;

import java.util.HashMap;

public class ParticularKeyInMap {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
        hm.put(10, "hi");
        hm.put(15, "4");
        hm.put(20, "coding");
        hm.put(25, "assignment");
        hm.put(30, "bye");

        System.out.println("The hashmap is "+ hm);
        boolean flag = hm.containsKey(22);
        System.out.println("Key 22 exists in HashMap? : " + flag);
        
        boolean flag2 = hm.containsKey(30);
        System.out.println("Key 30 exists in HashMap? : " + flag2);
	}

}
