
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
