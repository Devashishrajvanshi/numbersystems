package numbersystems;

import java.util.Scanner;

public class question22 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int n1=n;
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
			rev=rem+rev*10;
			n=n/10;
			
		}
		if(n1==rev)
		{
			System.out.println(n1+":is palindrom number");
		}
		else
		{
			System.out.println(n1+":is not palindrom number");
		}
	}

}
