import java.util.Scanner;;
public class PrimeNumber {

	public static void main(String[] args) {
		int n,i;
		boolean prime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		for(i=2;i<n;i++) {
			if(n%i==0) {
		 prime =false;
		 break;
			
			
			}
		}
     System.out.println(prime);
	}

}
