import java.util.Scanner;
class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,n;
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter a number");
		n=sc.nextInt();
		System.out.println("fibonacci series up to " +n+ "terms");
for(int i=1;i<=n;i++) {
System.out.print(a+ " ");
int sum=a+b;
a=b;
b=sum;
	}

}
}