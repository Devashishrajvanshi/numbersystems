package numbersystems;

import java.util.Scanner;

public class question30 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int t1=n;
		int sum=0;
		while(t1!=0)
		{   
			int rem=t1%10;
			 int mul=1;
			for(int i=1;i<=rem;i++)
			{  
				 mul=mul*i;	 
			}
			t1=t1/10;
			sum=sum+mul;
		}
		if(n==sum)
		{
			System.out.println(n+" is strong number");
		}
		else 
		{
			System.out.println(n+" is not a strong number");
		}
		
	}

}
