package operators;

public class BitwiseOperator {

	public static void main(String[] args) {
		// & and operator = it will produce true if both values are true
		// | or operator = it will produce true if either one is true
		//^ ex-or operator
		System.out.println(true & true);
		System.out.println(true & false);
		System.out.println(false & true);
		
		System.out.println(true | true);
		System.out.println(true | false);
		System.out.println(false | true);
		
		System.out.println(false ^ false);
		System.out.println(true ^ true);
		System.out.println(true ^ false);

	}

}
