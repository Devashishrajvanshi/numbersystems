package numbersystems;

import java.util.Scanner;

public class question60 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        System.out.println("Enter the value of r:");
        int r = sc.nextInt();

        
        long ncr = calculateNCR(n, r);
        System.out.println("NCR = " + ncr);

        
        long npr = calculateNPR(n, r);
        System.out.println("NPR = " + npr);
    }

    private static long calculateNCR(int n, int r) 
    {
        return factorial(n) / (factorial(n - r) * factorial(r));
    }
    
    private static long calculateNPR(int n, int r) 
    {
        return factorial(n) / factorial(n - r);
    }

 
    private static long factorial(int num)
    {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
