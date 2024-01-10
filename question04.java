package numbersystems;

import java.util.Scanner;

public class question04 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the side");
	int side=sc.nextInt();
	int areaOfSquaer=0;
	int perimeterOfSquaer=0;
	
	areaOfSquaer=side*side;
	System.out.println("Area:"+areaOfSquaer);
	perimeterOfSquaer=4*side;
	System.out.println("Perimeter:"+perimeterOfSquaer);
	
}
}
