package study;
import java.*;
import java.util.Scanner;
class 
public class Buffer {
	public static void main(String args[])
	{   
		boolean c=false;
		Scanner sc =new Scanner(System.in);
		StringBuffer b=new StringBuffer(sc.nextLine());
		System.out.println(b.lastIndexOf("a"));
		System.out.println(b.indexOf("r"));
		//System.out.println(b.append("jisna"));
	    //System.out.println(b.indexOf("j"));
	}

}
