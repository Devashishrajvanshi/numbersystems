package numbersystems;

import java.util.Scanner;

public class question44 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("enter the number");
	    int n=sc.nextInt();
	    question44 q = new question44();
	    int x = q.checkHappy(n);
	    if(x==1) {
	    	
	    	System.out.println("Happy");
	    }
	    else {
	    	System.out.println("Not Happy");
	    }
	    
	}
	
	private int checkHappy(int t1) {
		int sum=0;
		while(t1!=0)
	    {
	    	int rem=t1%10;
	    	sum = sum+(rem*rem);
	    	t1=t1/10;
	    }
		if(sum>9) {
			sum = checkHappy(sum);
			}
		return sum;
	}
}
