class X{
	int x;
	static int y;
	X(){
		System.out.println("Hi A");
	}
	X(int a){
		x=a;
		System.out.println("Hello A");
		
	}
	static {
		y=15;
		System.out.println("class Loaded");
	}
	{
		System.out.println("object created");
	}
}
public class InheritanceEx4 {

	public static void main(String[] args) {
	X x1=new X();
	X x2=new X(4);
	System.out.println(x1.x);
	System.out.println(x2.x);
	

	}

}
