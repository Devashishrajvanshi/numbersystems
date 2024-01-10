package numbersystems;

import java.util.Scanner;

public class question29 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int t1=n;
	int count=0;
	int count2=0;
	int sum=0;
	for(int i=1;i<=n;i++)
	{
		if(n%i==0)
		{
			count++;
		}
	}
	if(count==2)
	{
		while(t1!=0)
		{
			int rem=t1%10;
			sum=rem+sum*10;
			t1=t1/10;
			
		}
	}
	for(int i=1;i<=sum;i++)
	{
		if(sum%i==0)
		{
			count2++;
		}
	}
	if(count2==2)
	{
		System.out.println(n+" is emirp number");
	}
	else
	{
		System.out.println(n+" is not emirp number");
	}
}
}
