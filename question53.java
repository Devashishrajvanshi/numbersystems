package numbersystems;

public class question53 {
  public static void main(String[] args) {
	int arr[]= {2,5,4,8,3,7,2};
	System.out.println("using for loop.....");
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	
	System.out.println("using for each loop.....");
	for(int a:arr)
	{
		System.out.print(a+" ");
	}
}
}
