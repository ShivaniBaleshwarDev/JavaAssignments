package assignment4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicatesUsingHashMap {

		// TODO Auto-generated method stub
		public void countDupChars(String str){
	           Map<Character, Integer> map = new HashMap<Character, Integer>(); 
	           char[] chars = str.toCharArray();
	       for(Character ch:chars)
	           {
	             if(map.containsKey(ch))
	             {
	                map.put(ch, map.get(ch)+1);
	             } 
	             else 
	             {
	                map.put(ch, 1);
	               }
	           }
	           Set<Character> keys = map.keySet();
	           for(Character ch:keys){
	             if(map.get(ch) > 1){
	               System.out.println("Char "+ch+" "+map.get(ch));
	             }
	           }
	         }
	       
	         public static void main(String a[]){
	               DuplicatesUsingHashMap obj = new DuplicatesUsingHashMap();
	           System.out.println("String:This is Professional Course");
	           System.out.println("-------------------------");
	           obj.countDupChars("This is SDET Professional Course");
	           System.out.println("\nString: Shivani B");
	           System.out.println("-------------------------");
	           obj.countDupChars("Shivani B");
	       
	       
	         }
	}


