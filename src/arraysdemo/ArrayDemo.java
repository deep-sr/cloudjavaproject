package arraysdemo;

public class ArrayDemo {

	public static void main(String[] args) {
double d[] = new double[5];

d[0]=88.11; // lowe bound
d[1]=89.12;
d[2]=88.67;
d[3]=39.66;
d[4]=75.34;// size-1=upper bound

System.out.println("size of the given array "+ d.length);
System.out.println("**************");
System.out.println("value present on 3rd index "+d[3]);
System.out.println("**************");
/*
 * for(int i=0; i<d.length; i++) { System.out.println(d[i]);
 * 
 * }
 */
System.out.println("************");

for (double e : d) {
	System.out.println(e);
	
}
	}

}
