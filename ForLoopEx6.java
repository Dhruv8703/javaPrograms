
public class ForLoopEx6 {

	public static void main(String[] args) {
	 java.util.Scanner sc=new java.util.Scanner(System.in);
	 System.out.println("Enter a number");
	 int n= sc.nextInt();
	 int Multiply=1;
	 for(int a=1;a<=n;a++) {
		 Multiply*=a;
		 
	}
	 System.out.println("Multiplication ="+Multiply);
	}
}
