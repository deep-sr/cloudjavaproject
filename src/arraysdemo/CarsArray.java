package arraysdemo;

public class CarsArray {

	public static void main(String[] args) {
		
	String car[]= new String[5];
	
	car[0]="Audi";
			car[1]="Honda";
			car[2]="Maruthi";
			car[3]="BMW";
			car[4]="Benz";
			System.out.println(car[0]);
			System.out.println(car[3]);
			System.out.println("***********");
			for (String carmake : car)
			{
				System.out.println(carmake);
			}
			
			

	}

}
