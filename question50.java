package numbersystems;

import java.util.Scanner;
 

public class question50 {
	static int height;
	static int breathe;
	static int area;
	static {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter breathe");
		  breathe=sc.nextInt();
		 System.out.println("enter height");
		  height=sc.nextInt();
		  if(breathe>0 && height>0)
		  {
			  area=breathe*height;
		  }
		  else {
			  System.out.println("error");
			  System.exit(0);
		  }
	}
	
	public static void main(String[] args) {
		System.out.println("area is :"+area);
	}
	

}
