package flowcontrolstatements;

import java.util.Scanner;

public class Registration {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Age");

		int age = scan.nextInt();
		if (age>=18)
		{
			System.out.println("Allow the user to take vaccination");
		}
		else 
		{
			System.out.println("vaccination is not available for people below 18. Wait for your turn");
		}
		scan.close();

	}

}
