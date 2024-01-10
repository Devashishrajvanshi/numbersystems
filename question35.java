package numbersystems;

import java.util.Scanner;

public class question35 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	double n=sc.nextInt();
	double sqrt=n/2;
	double t;
	do
	{
		t=sqrt;
		sqrt=(t+(n/t))/2.0;
	}while((t-sqrt)!=0);
	System.out.println(sqrt);
}
}
