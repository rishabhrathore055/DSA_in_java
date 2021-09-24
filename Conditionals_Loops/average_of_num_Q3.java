import java.util.Scanner;

public class average_of_num_Q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x, average, sum = 0;
        System.out.print("Enter The Value N : ");
        int n = in.nextInt();
        for(int i =1;i<=n;i++)
        {
            System.out.print("Enter the "+i+" number? : ");
            x = in.nextFloat();
            sum = sum + x;
        }
        average = sum / n;
        System.out.println(average);



    }
}
