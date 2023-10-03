import java.util.Scanner;

public class breakInSwitchCase {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc= new Scanner(System.in);
        age= sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you are going to become a adult ");
                break;
            case 26:
                System.out.println("you are going get a job ");
                break;
            case 50:
                System.out.println("you are going to get retired");
                break;


        }

    }
}