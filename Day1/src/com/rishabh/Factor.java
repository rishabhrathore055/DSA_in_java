package helloWorld;

import java.util.Scanner;


public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number : ");
		System.out.println();
		int num = input.nextInt();
		for(int i=1; i<=num; i++) {
			if(num%i==0)
				System.out.print(i+" ");
		}

	}

}
