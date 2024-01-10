package numbersystems;

import java.util.Scanner;

public class question24 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int t1=n;
		int length=0;
		while(t1!=0)
		{
			t1=t1/10;
			length=length+1;
		}
		int arm=0;
		int t2=n;
		while(t2!=0)
		{   int mul=1;
			int rem=t2%10;
			for(int i=1;i<=length;i++)
			{
				mul=rem*mul;
				
			}
			arm=arm+mul;
			t2=t2/10;	
		}
		if(n==arm)
		{
			System.out.println("arm");
		}
		else
		{
			System.out.println("not arm");
		}
		
	}

}
