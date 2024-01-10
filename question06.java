package numbersystems;

import java.util.Scanner;

public class question06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		int add=n1+n2;
		System.out.println("Addition:"+add);
		int sub=n1-n2;
		System.out.println("Subtraction:"+sub);
		int mul=n1*n2;
		System.out.println("Multiplication:"+mul);
		int div=n1/n2;
		System.out.println("Division:"+div);
		
		
	}

}
