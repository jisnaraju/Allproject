package test;
import java.util.*;

public class Hai {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
	      String arr[]=new String[n];
			 for(int i=0;i<n;i++){
				 arr[i]=sc.nextLine();
			 }
			 for(int i=0;i<n;i++){
				 if(arr[i].charAt(0).equals('A')||arr[i].charAt(0).equals('E')||arr[i].charAt(0).equals('I')||arr[i].charAt(0).equals('O')||arr[i].charAt(0).equals('U'))
				 {
						System.out.println(arr[i]);
					}
				 else if(arr[i].charAt(0).equals('a')||arr[i].charAt(0).equals("e")|arr[i].charAt(0).equals("i")|arr[i].charAt(0).equals("o")||arr[i].charAt(0).equals("u"))
					{
				     System.out.println(arr[i]);
					}
			 }
			 
              
		
}
}