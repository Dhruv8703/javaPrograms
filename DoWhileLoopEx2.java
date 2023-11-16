import java.util.Scanner;
public class DoWhileLoopEx2 {

	public static void main(String[] args) {
		String choice;
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
		System.out.println("Square of "+n+" is "+n*n);
		
		System.out.println("Do you wanna continue?[y/n]");
		choice=sc.next();
	}while(choice.equalsIgnoreCase("y"));

}
}