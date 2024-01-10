package numbersystems;

import java.util.Scanner;

public class question03 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int length=sc.nextInt();
	System.out.println("enter the breathe");
	int breathe=sc.nextInt();
	int area=length*breathe;
	System.out.println("Area:"+area);
	int perimeter=2*(length+breathe);
	System.out.println("Perimeter:"+perimeter);
	
	
}
}
