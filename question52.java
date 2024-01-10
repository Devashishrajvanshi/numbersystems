package numbersystems;

import java.util.Scanner;

public class question52 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number between 1 and 5:");
		int n = sc.nextInt();

		switch (n) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			for (int i = 1; i <= 5; i++) {
				System.out.println("Iteration: " + i);

				if (i == n) {
					System.out.println("Using 'continue' to skip the rest of the code in this iteration.");
					continue;
				}

				if (i == n) {
					System.out.println("Using 'break' to exit the loop prematurely.");
					break;
				}

				System.out.println("This line will be skipped if 'continue' is used.");
			}
			System.out.println("This line will be skipped if 'break' is used.");
			break;
		default:
			System.out.println("Invalid input. Please enter a number between 1 and 5.");
		}

		System.out.println("Program complete.");
	}
}