package assignment4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class KeysToMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer, String> myMap = new HashMap<>();                       
         myMap.put(1, "Hi");                       
         myMap.put(2, "Iam");                       
         myMap.put(3, "Good");                       
         myMap.put(4, "Aww");    
         ArrayList<Integer> keyList = new ArrayList<Integer>(myMap.keySet());                       
         ArrayList<String> valueList = new ArrayList<String>(myMap.values()); 
         System.out.println("contents of the list holding keys the map ::"+keyList);                       
         System.out.println("contents of the list holding values of the map ::"+valueList);     
	}

}
