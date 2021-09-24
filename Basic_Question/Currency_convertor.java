import java.util.Scanner;

public class Currency_convertor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount(in INR) : ");
		
		int inr = input.nextInt();
		System.out.println("The amount in USD will be : "+inr*0.013);
	}

}
