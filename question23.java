package numbersystems;

import java.util.Scanner;

public class question23 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=i*fact;
		}
		System.out.println(fact);
	}

}
