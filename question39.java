package numbersystems;

import java.util.Scanner;

public class question39 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int even=0;
		int odd=0;
		int res=0;
		while(n!=0)
		{
			int rem=n%10;
			if(n%2==0)
			{
				even=even+rem;
			}
			else
			{
				odd=odd+rem;
			}
			n=n/10;
		}
		res=odd-even;
		System.out.println(res);
		
	}

}
