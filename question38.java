package numbersystems;

import java.util.Scanner;

public class question38 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		int sum=0;
	  for(int i=1;i<n;i++)	
	  {
		  if(n%i==0)
		  {
			  sum=sum+i;
		  }
	  }
	  if(n==sum)
	  {
		  System.out.println(n+" is perfact number");
	  }
	  else 
	  {
		  System.out.println(n+" is not perfact number");
	  }
	
	}

}
