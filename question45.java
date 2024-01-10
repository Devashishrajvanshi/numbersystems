package numbersystems;

import java.util.Scanner;

public class question45 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number");
	int n=sc.nextInt();
	System.out.println("enter the power of number");
	int p=sc.nextInt();
	question45 q = new question45();
	System.out.println(q.power(n,p));
}

	private int power(int n,int p) {
		if(p==0) {
			return 1;}
		return n*power(n,p-1);
	}
}
