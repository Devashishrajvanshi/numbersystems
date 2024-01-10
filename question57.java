package numbersystems;

public class question57 {
public static void main(String[] args) {
	int num1 = 5;
    System.out.println("Original value num1: " + num1);
    
    int preIncrement = ++num1;  
    System.out.println("After pre-increment num1: " + num1);
    System.out.println("Result of pre-increment: " + preIncrement);

    int num2 = 5;
    int postIncrement = num2++;
    System.out.println("After post-increment num2: " + num2);
    System.out.println("Result of post-increment: " + postIncrement);

   System.out.println();
    int num3 = 8;
    System.out.println("nOriginal value num3: " + num3);
    
    int preDecrement = --num3;  
    System.out.println("After pre-decrement num3: " + num3);
    System.out.println("Result of pre-decrement: " + preDecrement);

    int num4 = 8;
    int postDecrement = num4--; 
    System.out.println("After post-decrement num4: " + num4);
    System.out.println("Result of post-decrement: " + postDecrement);

}
}
