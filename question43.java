package numbersystems;

import java.util.Scanner;

public class question43 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=sc.nextInt();
		int t1=n;
		int t2=n;
		int length=0;
		int res=0;
		while(t1!=0)
		{
			length=length+1;
			t1=t1/10;
		}
		while(t2!=0)
		{
			int rem=t2%10;
			int mul=1;
			for(int i=1;i<=length;i++)
			{
			   mul=mul*rem;
			}
			length--;
			res=res+mul;
			t2=t2/10;		
		}
		if(res==n)
		{
			System.out.println(n+" is disarium number ");
		}
		else
		{
			System.out.println(n+" is not disarium number ");
		}
	}

}
