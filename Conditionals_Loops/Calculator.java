
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //mTake Input from user run till user does not enter X or x
        int ans = 0;
        while(true)
        {
            //take operator as input from user
            System.out.print("Enter The operator: ");
            char op = in.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
            {
                // Take 2 Number From user
                System.out.print("Enter Two Numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op == '+')
                {
                    ans =num1+num2;
                }
                if(op == '-')
                {
                    ans =num1 - num2;
                }
                if(op == '*')
                {
                    ans =num1 * num2;
                }
                if(op == '/')
                {
                    if(num2!=2){
                        ans = num1 / num2;
                    }
                }
                if(op == '%')
                {
                    ans = num1 % num2;
                }
            }
            else if(op =='x' || op=='X')
            {
                break;
            }
            else
            {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
        }

    }
}
