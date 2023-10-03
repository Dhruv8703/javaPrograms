public class breakAndContinue {
    public static void main(String[] args) {
        //break and continue using loops
        //    for (int i = 0; i < 5; i++) {
//            System.out.println(i);
//            System.out.println("Java is great");
//            if(i==2){
//                System.out.println("Ending the loop ");
//                break;
//            }
//        }
//            int i = 0;
//            while (i < 5) {
//                System.out.println(i);
//                System.out.println("java is great");
//                if (i == 2) {
//                    System.out.println("Ending the loop");
//                    break;
//                }
//                i++;
//            }
//            System.out.println("Loop ends here");
//        int i = 0;
//       do{
//            System.out.println(i);
//            System.out.println("java is great");
//            if (i == 2) {
//                System.out.println("Ending the loop");
//                break;
//            }
//            i++;
//        }while(i<5);
//        System.out.println("Loop ends here");
//        }
//    }
        for (int j = 0; j < 5; j++) {
            if (j == 2) {
                System.out.println("ending the loop");
                continue;
            }
            System.out.println(j);
            System.out.println("java is great");
        }
    }
}