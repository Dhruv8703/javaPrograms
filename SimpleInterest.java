
public class SimpleInterest {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the principle");
		float P= sc.nextFloat();
		System.out.println("Enter the rate");
		float R =sc.nextFloat();
		System.out.println("Enter the time");
		int T= sc.nextInt();
		
		float SI=(P*R*T)/100;
		System.out.println("the SI is = "+SI);
	}

}
