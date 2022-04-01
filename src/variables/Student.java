package variables;

public class Student {
	String studentName;
	int rollNo;
	char gender;
	boolean isPresent;
	String dept;
	public static void main(String[] args) {
		Student s1= new Student();
		s1.studentName= "Arun";
		s1.rollNo =101;
		s1.gender = 'M';
		s1.isPresent = true;
		s1.dept = "collection";
		
		System.out.println("***Details of Student S1***");
		System.out.println(s1.studentName);
		System.out.println(s1.rollNo);
		System.out.println(s1.gender);
		System.out.println(s1.isPresent);
		System.out.println(s1.dept);
		System.out.println("**********");
		
		Student s2= new Student();
		s2.studentName= "Geetha";
		s2.rollNo =105;
		s2.gender = 'F';
		s2.isPresent = true;
		s2.dept = "Teaching";
		
		System.out.println("***Details of Student S2***");
		System.out.println(s2.studentName);
		System.out.println(s2.rollNo);
		System.out.println(s2.gender);
		System.out.println(s2.isPresent);
		System.out.println(s2.dept);
		System.out.println("**********");
		
	} 

}
