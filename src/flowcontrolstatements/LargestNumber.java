package flowcontrolstatements;

public class LargestNumber {

	public static void main(String[] args) {
	int a=100;
	int b=40;
	int c=200;
	
	if (a>b & a>c) //false & true =false
	{
		System.out.println("a is greater");
	}
	else if (b>a & b>c) //true &true =true
	{
		System.out.println("b is greater");
	}
	else
	{
		System.out.println("c is greater");
	}
	
	}

}
