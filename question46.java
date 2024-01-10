package numbersystems;

import java.util.Scanner;

public class question46 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println(decimalToBinary( n));
		System.out.println(decimalToOctal( n));
		System.out.println(decimalToHexadecimal(n));
	}
	public static int decimalToBinary(int n)
	{
		int binary=0;
		int mul=1;
		while(n!=0)
		{
			int rem=n%2;
			binary =binary+rem*mul;
			mul=mul*10;
			n/=2;
			
		}
		return binary;
	}
	public static int decimalToOctal(int n)
	{
		int octal=0;
		int mul=1;
		while(n!=0)
		{
			int rem=n%8;
			octal =octal+rem*mul;
			mul=mul*10;
			n/=8;
			
		}
		return octal;
	}
	public static int decimalToHexadecimal(int n)
	{
		int hexadecimal=0;
		int mul=1;
		while(n!=0)
		{
			int rem=n%16;
			hexadecimal =hexadecimal+rem*mul;
			mul=mul*10;
			n/=16;
			
		}
		return hexadecimal;
	}

}
