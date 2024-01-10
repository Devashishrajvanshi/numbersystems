package numbersystems;

public class question48
{
	 private int id;
	    private String firstName;
	    private String lastName;
	    private String birthdate;

	   
	    private static int nextId = 1;

	   
	    public question48(String firstName, String lastName, String birthdate) 
	    {
	        this.id = nextId++;
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.birthdate = birthdate;
	    }

	  
	    public void displayDetails()
	    {
	        System.out.println("ID: " + id);
	        System.out.println("First Name: " + firstName);
	        System.out.println("Last Name: " + lastName);
	        System.out.println("Birthdate: " + birthdate);
	        System.out.println();
	    }

	    public static void main(String[] args) 
	    {
	     
	        question48[] students = new question48[4];

	        
	        students[0] = new question48("John", "Doe", "1990-05-15");
	        students[1] = new question48("Alice", "Smith", "1992-08-20");
	        students[2] = new question48("Bob", "Johnson", "1991-03-25");
	        students[3] = new question48("Eva", "Brown", "1993-11-10");

	        
	        System.out.println("Student Details:");
	        for (question48 q : students)
	        {
	           q.displayDetails();
	        }
	    }
}
