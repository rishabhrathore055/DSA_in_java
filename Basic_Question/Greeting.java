import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String str = input.next();
        System.out.println("Hey! Good Morning " + str);
    }
}
