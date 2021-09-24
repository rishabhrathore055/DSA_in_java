
import java.util.Scanner;

public class Simple_Interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        float P = input.nextFloat();
        System.out.print("Enter Time Periods: ");
        float T = input.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        float R = input.nextFloat();
        float ans = (P * R * T) / 100;
        System.out.println(ans);


    }
}
