
import java.util.Scanner;

    public class sum {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

//      <----------Integer---------->
//        int n1 = input.nextInt();
//        int n2 = input.nextInt();
//        int sum = n1+n2;

//      <----------Float---------->
//        float n1 = input.nextFloat();
//        float n2 = input.nextFloat();
//        float sum = n1 + n2;

//      <----------Double---------->
            System.out.println("Enter First Number");
            double  n1 = input.nextDouble() ;
            System.out.println("Enter Second Number");
            double  n2 = input.nextDouble() ;
            double  sum = n1 + n2;
            System.out.println("sum = " + sum);
        }
    }
