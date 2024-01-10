package numbersystems;

import java.util.Scanner;

public class question05 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int length=sc.nextInt();
	int meter=length/100;
	System.out.println("meter:"+meter+"meter");
	double foot=length/30.48;
	System.out.println("foot:"+foot+"foot");
}
}
