
public class IfElseEx5 {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Enter the number");
		int a= sc.nextInt();
		System.out.println("Enter the number");
		int b= sc.nextInt();
		System.out.println("Enter the number");
		int c= sc.nextInt();
		System.out.println("Enter the number");
		int d= sc.nextInt();
		if(a>b && a>c) {
			System.out.println(a+" is greatest");
			
		}else if(b>c && b>d) {
			System.out.println(b+" is greatest");
		}else if (c>d){
			System.out.println(c+" is greatest");
		}else {
			System.out.println(d+" is greatest");
		}
		
		

	}

}
