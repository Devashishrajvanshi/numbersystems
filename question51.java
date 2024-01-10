package numbersystems;

public class question51 {
	static byte b;
	static short s;
	static int i;
	static long l;
	static char ch;
	static float f;
	static double d;
	static boolean bl;
	String st;
	Object obj;
	public static void main(String[] args) {
		
		System.out.println("default value of primitive data type..........");
		System.out.println("byte:"+b);
		System.out.println("short:"+s);
		System.out.println("int:"+i);
		System.out.println("long:"+l);
		System.out.println("char:"+ch);
		System.out.println("float:"+f);
		System.out.println("double:"+d);
		System.out.println("boolean:"+bl);
		System.out.println("default value of non-primitive data type..........");
		question51 q=new question51 ();
		System.out.println(q.st);
		System.out.println(q.obj);
		
	}

}
