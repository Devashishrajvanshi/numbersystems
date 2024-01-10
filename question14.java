package numbersystems;

import java.util.Scanner;

public class question14 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the amount");
	double amount=sc.nextDouble();
	System.out.println("enter the interest rate");
	double interest=sc.nextDouble();
	System.out.println("enter the time period");
	double timep=sc.nextDouble();
	double simpleInterest=amount*(1+(interest*timep)/100)-amount;
	System.out.println("simple interest is:"+simpleInterest);
}
}
