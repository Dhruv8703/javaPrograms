class AAA{
	int x=10;
	AAA(){super();
	System.out.println("Hi A");
	}
	void m1() {
		System.out.println("Hello A");
	}
}
class BBB extends AAA{
	int y=20;
	BBB(){
		super ();
		System.out.println("Hi B");
	}
	void m2() {
		System.out.println("Hi B");
	}
	
}
public class InheritanceConstructorEx1 {

	public static void main(String[] args) {
	AAA a= new AAA();
	BBB b =new BBB();
	

	}

}
