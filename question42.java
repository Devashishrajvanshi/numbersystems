package numbersystems;

import java.util.Scanner;

public class question42 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	int b=convertBinary(n);
	System.out.println(b);
	System.out.println(countSettedDigit(b));
	
	}
public static int convertBinary(int n)
{
	int binary=0;
	int mul=1;
	while(n!=0)
	{
		int rem=n%2;
		binary =binary+rem*mul;
		mul=mul*10;
		n=n/2;
	}
	return binary;
}
public static int countSettedDigit(int binary)
{   int count=0;
	while(binary!=0)
	{
		int rem=binary%10;
		if(rem==1)
		{
			count++;
		}
		binary=binary/10;
	}
	return count;
}
}
