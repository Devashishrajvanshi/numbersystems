package numbersystems;

import java.util.Scanner;

public class question28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter tne number");
		int n=sc.nextInt();
		int t1=n;
		int n2=n*n;
		int sum=0;
		int sum2=0;
		while(t1!=0)
		{
			int rem=n2%10;
			sum=rem+sum*10;
			n2=n2/10;
			t1=t1/10;
			
		}
		while(sum!=0)
		{
			int rem=sum%10;
			sum2=rem+sum2*10;
			sum=sum/10;
			
		}
		if(n==sum2)
		{
			System.out.println(n+" is automorphic number");
		}
		else
		{
			System.out.println(n+" is not automorphic number");
		}
		
	}

}
