package arraysdemo;

public class Student {

	public static void main(String[] args) {
		//-	To overcome the problem of homogenous type array we use object class to make it heterogenous
	Object student [] = new Object[5];
	student[0]=2526;
	student[1]="Deepika";
	student[2]='F';
	student[3]=98.66;
	student[4]="Automation Testing";
	for (Object details : student) 
	{
		System.out.println("student details "+ details );
	}
	
			

	}

}
