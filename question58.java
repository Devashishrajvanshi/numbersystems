package numbersystems;

import java.util.Scanner;

public class question58 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter Present Value :");
        double PV = sc.nextDouble();

        System.out.println("Enter Interest Rate (i in decimal form):");
        double i = sc.nextDouble();

        System.out.println("Enter Number of Periods:");
        int N = sc.nextInt();

        
        double FV = PV;

        for (int j = 0; j <N; j++) {
            FV = FV*(1 + i/100);
        }

        System.out.printf("Future Value is: "+ FV);
    }
	

}
