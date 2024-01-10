package numbersystems;

import java.util.Scanner;

public class question19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		System.out.println("enter the third number");
		int n3=sc.nextInt();
		if(n1==n2 || n1==n3 || n2==n3)
		{
			System.out.println("plese enter distinct values");
		}
		else if(n1<n2 && n1>n3 || n1>n2 && n1<n3 )
		{
			System.out.print(n1);
		}
		else if(n2<n1 && n2>n3 || n2>n1 && n2<n3)
		{
			System.out.println(n2);
		}
		else {
			System.out.println(n3);
		}
	}

}
