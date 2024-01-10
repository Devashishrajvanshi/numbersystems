package numbersystems;

import java.util.Scanner;

public class question41 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	
		System.out.println(findAverage(n));
	}
	private static int findAverage(int n) {
	int sum=0;
	int count=0;
	
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem;
			count++;
			n=n/10;
		}
		int res=sum/count;
		return res;
	}
}
