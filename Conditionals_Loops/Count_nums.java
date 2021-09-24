
import java.util.Scanner;

public class Count_nums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = in.nextInt();
        System.out.println("Enter the Digit to check Count");
        int inp = in.nextInt();
        int output =0;
        while(n>0)
        {
            int rem = n%10;
            if(rem == inp) {
                output++;
            }
            n/=10;
        }
        System.out.println(output );
    }
}
