package numbersystems;

import java.util.Scanner;

public class question20 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the length");
	int n=sc.nextInt();
    int a=0;
    int b=1;
    if(n==a)
    {
    	System.out.println(a);
    }
    else if(n==b)
    {
    	System.out.println(a);
    	System.out.println(b);
    }
    else
    {
    	System.out.println(a);
    	System.out.println(b);
    }
    for(int i=1;i<=n;i++)
    {
    	int temp=a+b;
    	a=b;
    	b=temp;
    	System.out.println(temp);
    }
}
}
