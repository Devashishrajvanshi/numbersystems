package numbersystems;

import java.util.Scanner;

public class question07 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number");
	int num=sc.nextInt();
	if(num>0)
	{
		System.out.println(num+":number is positive number");
	}
	else if(num<0)
	{
		System.out.println(num+":number is negative number");
	}
	else
	{
		System.out.println(num+"number :is zero number");
	}
}
}
