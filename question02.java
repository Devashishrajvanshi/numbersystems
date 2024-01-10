package numbersystems;

import java.util.Scanner;

public class question02 {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("enter the radius");
	int r=sc.nextInt();
	double area=0;
	double circumference=0;
	double pie=3.14;
	area=(pie*r*r);
	System.out.println("Area:"+area);
	circumference=(2*pie*r);
	System.out.println("circumference:"+circumference);
	
}
}
