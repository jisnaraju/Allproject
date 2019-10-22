package study;

public class Nuullpointer {
	   

	public static void main(String[] args) {
		int a=10;
		try {
		if(a==10)
		{
			throw new ArithmeticException();
		}
		}
		
		catch(ArithmeticException e)
		{
			System.out.println();
		}
	}

}
