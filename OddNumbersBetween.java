package assignment2;

public class OddNumbersBetween {

	public static void main(String[] args) {
		System.out.print("The odd numbers between 79 and 187 are ");
		for(int i=79;i<=187;i++) {
			if(i%2!=0)
			{
				System.out.print(i+" ");
			}
		}
	}

}
