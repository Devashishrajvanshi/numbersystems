package numbersystems;

import java.util.Scanner;

public class question17 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		if(num==1 || num==3 || num==5 ||num==7 ||num==8 ||num==10 ||num==12)
		{
			System.out.println("31");
		}
		else if(num==4 || num==6 ||num==9 || num==11)
		{
			System.out.println("30");
		}
		else if(num==2)
		{
			System.out.println("28 or 29");
		}
		else 
		{
			System.out.println("invalid number");
		}
	}


}
