package numbersystems;

import java.util.Scanner;

public class question32 {
  public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int binary=0;
	int mul=1;
	int count=0;
	while(n!=0)
	{
		int rem=n%2;
		binary=binary+rem*mul;
		mul=mul*10;
		n=n/2;
		
	}
	while(binary!=0)
	{
		int rem=binary%10;
		if(rem==1)
		{
			count++;
		}
		binary=binary/10;
	}
	if(count%2==0)
	{
		System.out.println("evil number");
	}
	else
	{
		System.out.println("odius number");
	}
}
}
