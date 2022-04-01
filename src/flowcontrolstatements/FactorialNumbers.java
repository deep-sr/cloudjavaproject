package flowcontrolstatements;

public class FactorialNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Program to find factorial number= 5 (5*4*3*2*1=120)
		int res = 1;
		for (int i=5; i>=1; i--)
		{
			res=res*i;
			
					
		}
		System.out.println("Factorial of 5=" + res);
	}

}
