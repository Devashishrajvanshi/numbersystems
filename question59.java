package numbersystems;

import java.util.Scanner;

public class question59 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int n1=sc.nextInt();
		System.out.println("enter the second number ");
		int n2=sc.nextInt();
		int lcm = calculateLCM(n1, n2);
        System.out.println("LCM of " + n1 + " and " + n2 + " is: " + lcm);
		
	}
	private static int calculateLCM(int a, int b) {
        
        return (a * b) / calculateGCD(a, b);
    }

    
    private static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
