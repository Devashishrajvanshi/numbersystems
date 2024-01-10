package numbersystems;

import java.util.Scanner;

public class question31 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		long binary=0;
		int rem,i=1;
		while(n!=0)
		{
			rem=n%2;
			binary=binary+rem*i;
			i=i*10;
			n=n/2;
			
		}
		System.out.println(binary);
		
		
	}

}
