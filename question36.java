package numbersystems;

import java.util.Scanner;

public class question36 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number");
		int n2=sc.nextInt();
		
		if(n1<n2) {
			n1 = n1+n2;
			n2=n1-n2;
			n1=n1-n2;
		}
		
		int n3=n2;
		
		if(n1%n2==0) {
			System.out.println(n2);
		}
		else if(n1%(n2/2)==0 && n2%(n2/2)==0) {
			System.out.println(n2/2);
		}
		else {
			n2=(n2/2)-1;
			do {
				if(n1%n2==0 && n3%n2==0)
					break;
				n2--;
			}while(n2!=0);
			System.out.print(n2);
		}
		
	}

}
