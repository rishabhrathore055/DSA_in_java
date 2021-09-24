
import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = input.nextInt();
        if(num<=1){
            System.out.println("Neither prime nor composite");
            return;
        }
        int test = 2;
        if(num == 4){
            System.out.println("Not prime");
        }
        else{
            while(test * test < num){
                if(num % test ==0)
                {
                    System.out.println("Not Prime");
                }
                test++;
            }
            if(num * num > test){
                System.out.println("Prime");
            }
        }
    }
}
