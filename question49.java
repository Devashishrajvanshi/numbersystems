package numbersystems;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class question49 {
	
	
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);

	        
	        System.out.println("Enter the amount:");
	        double amount = sc.nextDouble();

	        
	        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
	        NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        NumberFormat indianFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

	        
	        System.out.println("US: " + usFormat.format(amount));
	        System.out.println("French: " + frenchFormat.format(amount)+"Euro");
	        System.out.println("Indian: Rs." + indianFormat.format(amount));
	    
	    }
	}

