package numbersystems;

public class question47 {
	String name;
	int id;
	String stream;
	public question47(String name, int id, String stream) {
		
		this.name = name;
		this.id = id;
		this.stream = stream;
	}
	
	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getStream() {
		return stream;
	}
	
	

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", stream=" + stream ;
	}

	public static void main(String[] args)
	{
		question47 q=new question47("name",5,"stream");
		System.out.println(q.id+" "+q.name+" "+q.stream);
		System.out.println(q);
		
	}

}
