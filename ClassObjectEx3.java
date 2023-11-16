
 

	class emp1{
		String name;
		int salary;
		String cname;
		
		void show() {
			System.out.println(name+" "+salary+" "+cname);
			
		}
		void input(String n,int s, String c) {
			name=n;
			salary=s;
			cname=c;
		}

		class OOP {

		public static void main(String[] args) {
		emp1 a= new emp1();
		emp1 b=new emp1();
		emp1 c= new emp1();
		emp1 d=new emp1();
		
		a.show();
		b.show();
		c.show();
		d.show();
		
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
	}

