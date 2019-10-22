package assess;
import java.util.*;
import java.lang.Math;

public class Assesement {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int count=0,r,r1,num=n,sum=1;
	int power=1;

	while(num!=0)
	{
		r=num%10;
		num=num/10;
		r1=num%10;
		power=(int) Math.pow(r1,r);
		sum=sum+power;
		
	}
	System.out.println(sum);
		

	}

}
