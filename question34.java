package numbersystems;

import java.util.Scanner;

public class question34 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int t1=n;
		int firstAndLastNumber=0;
		int middeleNumber=0;
		while(t1!=0)
		{
			if(t1==n || t1<9)
			{                  firstAndLastNumber=firstAndLastNumber+t1%10;
			}
			else
			{
				                  middeleNumber=middeleNumber+t1%10;
			}
			t1=t1/10;
		  
		}
		if(firstAndLastNumber==middeleNumber)
		{
			System.out.println(n+" is xylem number");
		}
		else
		{
			System.out.println(n+" is phloem number");
		}
	}

}
