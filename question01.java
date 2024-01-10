package numbersystems;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name:");
		String name=sc.next();
		System.out.println("enter the mobile no:");
		long phno=sc.nextLong();
		System.out.println("enter the 10th percentage:");
		double per1=sc.nextDouble();
		System.out.println("enter the 12th percentage:");
		double per2=sc.nextDouble();
		System.out.println("enter the degree percentage:");
		double per3=sc.nextDouble();
		
		System.out.println("name:"+name);
		System.out.println("mobile no:"+phno);
		System.out.println("10th:"+per1);
		System.out.println("12th:"+per2);
		System.out.println("degree:"+per3);
		
		
	}
}
