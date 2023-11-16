class xyz{
	double x;
	static int y=12;
	void show() {
		System.out.println(x+" "+y);
		
	}
	xyz(){
		this(3);
		System.out.println("Hi");
		x=15;
		
	}
	xyz(double a){
		System.out.println("ok");
		x+=a;
		y++;
		
	}
	static {
		System.out.println("incapp");
	}
	{
		System.out.println("hello");
	}
}
public class OOpAssignment2 {

	public static void main(String[] args) {
		xyz m1=new xyz();
		xyz m2= new xyz();
		m1.show();
		m2.show();

	}

}
