package numbersystems;

import java.util.Scanner;

public class question33 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int count=0;
		int n=sc.nextInt();
		int t1=n;
				while(n!=0)
		{
			int  rem=n%10;
			if(rem==0)
			{
				System.out.println(t1+" is duck number");
				count++;
			}
			
			n=n/10;
		}
				if(count<1)
				{
					System.out.println(t1+" is not duck number");
				}
		
	}

}
