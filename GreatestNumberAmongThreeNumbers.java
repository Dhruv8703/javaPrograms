
public class GreatestNumberAmongThreeNumbers {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("enter a number a");
		int a =sc.nextInt();
		System.out.println("enter number b");
		int b= sc.nextInt();
		System.out.println("enter a number c");
		int c= sc.nextInt();
		if(a>b&&a>c){
			System.out.println(a+" is the greatest");
			
			
		}else if(b>c) {
			System.out.println(b+" is the greatest");
			
		}else
			System.out.println(c+" is the greatest");

	}

}
