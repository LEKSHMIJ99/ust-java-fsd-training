package Exception;

public class Exception_2 {
	public static void main(String[] args)
	
	{
		try {
			int divideByZero= 5/0;
		}
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException=>"+ e.getMessage());
			}
			finally {
				System.out.println("this is finally block");
			}
		
	}

}
