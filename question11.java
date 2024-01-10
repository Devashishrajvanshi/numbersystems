package numbersystems;

import java.util.Scanner;

public class question11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the weight");
	double weight=sc.nextDouble();
	System.out.println("enter the height");
	double height=sc.nextDouble();
	
	double bmi=weight/(height*height);
	System.out.println(bmi);
}
}
