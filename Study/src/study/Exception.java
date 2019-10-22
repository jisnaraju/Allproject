package study;

public class Exception {

	public static void main(String[] args) {
		int i=4;
		int j=1;
		int a=0;
		try {
			a=i/j;
		   }
    catch(ArithmeticException e)
		{
    	  System.out.println("Cannot Divide by 0");
		}
		System.out.println(a);
	//}

}}
