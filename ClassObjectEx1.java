
public class ClassObjectEx1 {
public static void main(String[]s) {
	Employee a=new Employee();
	Employee b=new Employee();
	Employee c=new Employee();
	Employee d=new Employee();
	
	System.out.println(a.name+" "+a.salary+" "+a.cname);
	System.out.println(b.name+" "+b.salary+" "+b.cname);
	System.out.println(c.name+" "+c.salary+" "+c.cname);
	System.out.println(d.name+" "+d.salary+" "+d.cname);
	
	a.name="Dhruv Tewari";
	a.salary=1200000;
	a.cname="ABC";
	b.name="Sanju Baba";
	b.salary=1200030;
	b.cname="ABX";
	c.name="Gajodhar Tewari";
	c.salary=1230000;
	c.cname="XYZ";
	
	System.out.println(a.name+" "+a.salary+" "+a.cname);
	System.out.println(b.name+" "+b.salary+" "+b.cname);
	System.out.println(c.name+" "+c.salary+" "+c.cname);
	System.out.println(d.name+" "+d.salary+" "+d.cname);
	
}
}
class Employee{
	String name;
	int salary;
	String cname;
}