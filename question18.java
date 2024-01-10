package numbersystems;

import java.util.Scanner;

public class question18 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the year");
	int year=sc.nextInt();
	if(year%4==0)
	{
		if(year%400==0)
		{
			System.out.println("ly");
		}
		else if(year%100==0)
		{
			System.out.println("nlp");
		}
		else {
			System.out.println("ly");
		}
	}
	else {
		System.out.println("nly");
	}
	
}
}
