class Employeee{
	private String name;
	private int Salary=9000;
	private String cname;
	public void show() {
		System.out.println(name+" "+Salary+" "+cname);
	}
	void input(String n,int s,String c) {
		name=n;
		Salary=s;
		cname=c;
	}
	
	
}
public class ClassObjectEx4 {

	public static void main(String[] args) {
		Employeee a=new Employeee();
		Employeee b=new Employeee();
		Employeee c=new Employeee();
		Employeee d=new Employeee();


		a.input("Dhruv Tewari",134546546,"ABC");
		b.input("Akon pandey",432353566, "POI");
		c.input("Veeru paaji", 424466756,"ABE" );
		d.input("Bhairo Raj", 132444240, "CAL");
		
		a.show();
		b.show();
		c.show();
		d.show();
	}

}
