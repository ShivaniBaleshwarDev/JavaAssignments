package assignment3;

import java.util.Scanner;

public class StringPresentInSentence {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence = sc.nextLine();
		System.out.println("Enter a word you want to find out in the sentence");
		String find= sc.next(); 
		String[] word=sentence.split("[ ?.!@#$%^&*]++");
		for(int i=0;i<word.length;i++)
		{
			//System.out.println("word["+i+"]"+word[i]);
			if(word[i].equalsIgnoreCase(find))
			{
				System.out.println(find+" is found at "+i);
			}
		}

	}

}
