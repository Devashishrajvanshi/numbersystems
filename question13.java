package numbersystems;

import java.util.Scanner;

public class question13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int num2=num;
		int mul=1;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			mul=mul*rem;
			sum=sum+rem;
			num=num/10;
			
		}
		int mulsum=mul+sum;
		if(mulsum==num2)
		{
			System.out.println(num2+":is special number");
		}
		else
		{
			System.out.println(num2+":is not special number");
		}
		
	}
	

}
