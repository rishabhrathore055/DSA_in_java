
import java.util.Scanner;

public class evenoddF {
    public static void main(String[] args) {

        even();
    }
    static  void even(){
        Scanner in = new Scanner(System.in);
       int  num = in.nextInt();
        if(num%2==0)
            System.out.println("Even");
        else
            System.out.println("odd");
    }

}
