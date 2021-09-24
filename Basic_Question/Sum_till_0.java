
import java.util.Scanner;

public class Sum_till_0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 0 to print the sum : ");
		int n = input.nextInt();
		long sum =0;
		while(n!=0) {
				sum= sum+n;
				System.out.print("Enter 0 to print the sum : ");
				n = input.nextInt();
		}
		System.out.println("The sum is "+sum);
	}
}
