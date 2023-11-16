
public class ClassObjectEx2 {

	public static void main(String[] args) {
		Students a=new Students();
		Students b=new Students();
		Students c=new Students();
		Students d=new Students();
		
		System.out.println(a.name+" "+a.Fathername+" "+a.rollno);
		System.out.println(b.name+" "+b.Fathername+" "+b.rollno);
		System.out.println(c.name+" "+c.Fathername+" "+c.rollno);
		System.out.println(d.name+" "+d.Fathername+" "+d.rollno);
		
		a.name="Chattan Pandat";
		a.Fathername="Toofan pandat";
		a.rollno=12;
		b.name="Bunty Ulter";
		b.Fathername="Monty ulter";
        b.rollno=13;
        c.name="Romy";
        c.Fathername="Monu";
        c.rollno=15;
        d.name="Somu";
        d.Fathername="Bonu";
        d.rollno=14;
				
				
				
		System.out.println(a.name+" "+a.Fathername+" "+a.rollno);
		System.out.println(b.name+" "+b.Fathername+" "+b.rollno);
		System.out.println(c.name+" "+c.Fathername+" "+c.rollno);
		System.out.println(d.name+" "+d.Fathername+" "+d.rollno);
				
				
				
				

	}

}
class Students{
	String name;
	String Fathername;
	int rollno;
	
}