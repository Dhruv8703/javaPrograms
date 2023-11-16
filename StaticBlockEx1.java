class Animal {
	String name;
	int age;
	static String color;
	void show() {
		System.out.println(name+" "+age+" "+color);
	}
	void input(String n,int a) {
		name=n;
		age=a;
		
	}
static void display() {
	System.out.println("Hi Animal");
	System.out.println(color);
}
static{
	color="Green";
	System.out.println("hello animal");
	System.out.println(color);
}
	
}
public class StaticBlockEx1 {
static {
	System.out.println("hEllo world");
}
	public static void main(String[] args) {
		System.out.println("hello main");
		Animal.color="red";
	    Animal a=new Animal();
	    Animal b=new Animal();
	    Animal c=new Animal();
	    
a.input("dog",4);
b.input("cat",6);
c.input("tiger", 40);

a.show();
b.show();
c.show();

Animal.display();
a.display();

	}

}

