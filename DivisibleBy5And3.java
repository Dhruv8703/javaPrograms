
public class DivisibleBy5And3 {

	public static void main(String[] args) {
		
		java.util.Scanner sc= new java.util.Scanner(System.in);
		
		System.out.println("enter a number");
		 
		 int number = sc.nextInt();
		 if((number%5==0)&& ( number%3==0)) {
		 System.out.println("the given number is divisible by both 5 and 3");
		 
		 

	}else {
		System.out.println("the given is not divisible by both");
	}

}
}