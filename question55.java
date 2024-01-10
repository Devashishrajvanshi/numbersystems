package numbersystems;

import java.util.Scanner;

public class question55 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the number of subject 1");
	int sub1=sc.nextInt();
	System.out.println("enter the number of subject 2");
	int sub2=sc.nextInt();
	System.out.println("enter the number of subject 3");
	int sub3=sc.nextInt();
	System.out.println("enter the number of subject 4");
	int sub4=sc.nextInt();
	double res=(sub1+sub2+sub3+sub4)/4;
	System.out.println(res+"%");
}
}
