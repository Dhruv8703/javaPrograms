class Emp{
	String name;
	Emp(){
		System.out.println("Hello Emp");
		name="Dhruv";
		
	}
	static {
		System.out.println("Hi emp");
		
	}
	{
		System.out.println("I am Emp");
	}
}
public class InherhitanceEx3 {

	public static void main(String[] args) {
Emp e1=new Emp();
Emp e2= new Emp();
System.out.println(e1.name);

	}

}
