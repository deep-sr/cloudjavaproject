package flowcontrolstatements;

public class IfDemo {

	public static void main(String[] args) {
		
		int age = 10;
		if (age>=18)
		{
			System.out.println("Allow the user to take vaccination");
		}
		else
		{
			System.out.println("vaccination is not available for people below 18. wait for your turn");
		}
	}

}
