class ClassObjectAssignment3 {


	private int x;
	public void show() {
	x++;
	System.out.println(x);
	}
	public static void main(String[] args) {
		ClassObjectAssignment3 a= new ClassObjectAssignment3();
	a.show();
	ClassObjectAssignment3 b= new ClassObjectAssignment3();
	a.show();
	b.show();
	}
	}
