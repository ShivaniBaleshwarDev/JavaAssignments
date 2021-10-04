package assignment3;

public class NumberFormatException {

	public static void main(String[] args) {
		int a;
		String s="Hi";
		try{
			a=Integer.parseInt(s);
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		finally
		{
			System.out.println("Exception handled");
		}
		

	}

}
