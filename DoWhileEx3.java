import java.util.Scanner;
public class DoWhileEx3 {

	public static void main(String[] args) {
		int n;
		int factorial=1;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    n=sc.nextInt();
     for(int i=1;i<=n;i++) {
	factorial=factorial*i;
}
     System.out.println("the factorial is "+factorial);
	}

}
