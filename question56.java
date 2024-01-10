package numbersystems;

import java.util.Scanner;

public class question56 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the start rage");
	int s=sc.nextInt();
	System.out.println("enter the ending rage");
	int e=sc.nextInt();
	int sum=0;
	for(int i=s;i<=e;i++)
	{
		int count=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
			{
				count++;
			}
		}
		if(count==2)
		{   sum=sum+i;
			System.out.println(i+":is prime number");
		}
	}System.out.println("some of prime number is:"+sum);
	
}
}
