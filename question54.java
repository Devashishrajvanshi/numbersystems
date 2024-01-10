package numbersystems;

import java.util.Scanner;

public class question54 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the price of product");
		double mrp=sc.nextInt();
		System.out.println("enter the percentage of product");
		double per=sc.nextInt();
		
		double discount=((per/100)*(mrp));
		System.out.println(discount);
		double discountRateOfProduct=mrp-discount;
		System.out.println("discount rate of the product is:"+discountRateOfProduct);
		
		
	}

}
