
public class NestedIFElseEx {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter your age:");
		int a= sc.nextInt();
		if(a<0||a>120) {
		System.out.println("INVALID AGE!");
		}
		else {
			 if(a>=13 && a<=19) {
				 System.out.println("You are a teenager");
			}
				 else {
					 System.out.println("You are not a teenager");
					 
				 
				 }
				System.out.println("Thanks for using app!");
				

				}
				
			}
		
		

	}

