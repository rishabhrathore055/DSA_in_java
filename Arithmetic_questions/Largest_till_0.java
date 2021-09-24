
import java.util.Scanner;

public class Largest_till_0 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a no. or 0 to print the the largest no. : ");
		int n = input.nextInt();
		long max =-999999;
		while(n!=0) {
				if(n>max) {
					max= n;
				}
				System.out.print("Enter any no. 0 to print the largest no. : ");
				n = input.nextInt();
		}
		System.out.println("The largest no. entered till now is "+ max);
	}
}
