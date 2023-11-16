class employeeee{
	private String name;
	private int Salary;
	private String cname;
	public void show() {
		System.out.println(name+" "+Salary+" "+cname);
	}
		void input() {
			java.util.Scanner sc=new java.util.Scanner(System.in);
			System.out.println("Enter employee's details:");
			System.out.println("name:");
			name=sc.next();
			System.out.println("Salary:");
			Salary=sc.nextInt();
			System.out.println("cname:");
			cname=sc.next();
			
		
	}
	
}
public class ClassObjectEx5 {

	public static void main(String[] args) {
		employeeee a=new employeeee();
		employeeee b=new employeeee();
		employeeee c=new employeeee();
		employeeee d=new employeeee();
		 
		a.input();
		b.input();
		c.input();
		d.input();
		
		a.show();
		b.show();
		c.show();
		d.show();


	}

}
