package arraysdemo;

public class TwoDimArray {

	public static void main(String[] args) {
	String s[][]= new String[3][3];
	s[0][0] = "A";
	s[0][1] = "B";
	
	  s[0][2] = "C";
	  
	  s[1][0] = "A1"; s[1][1] = "B1"; s[1][2] = "C1";
	  
	  s[2][0] = "A2"; s[2][1] = "B2"; s[2][2] = "C2";
	 
	
	System.out.println("rows length "+s.length);
	System.out.println("column length "+s[0].length);
	System.out.println("**********");
	for (int i=0; i<s.length; i++)
	{
		for (int j=0; j<s[0].length; j++)
		{
			System.out.println(s[i][j]);
		}
	}
	System.out.println("***********");
	for (String[] row : s) {
for (String col : row) {
	System.out.println(col);
	
}		
	}
	}

}
