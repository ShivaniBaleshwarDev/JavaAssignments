package assignment3;

public class ArithmethicException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {                           
            int example = 500/0;                               
             System.out.println("You are not dividing a number by 0");                               
          } catch (ArithmeticException e) {                               
            System.out.println("Arithmetic Exception: cannot divide by 0");                               
          }                               
        }         
	}


