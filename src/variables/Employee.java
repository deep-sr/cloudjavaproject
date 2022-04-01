package variables;

public class Employee {
	String empName;
	int empID;
	static String empOrg ="H2K";
			public static void main(String[] args) {
		
			Employee e1 = new Employee();
			e1.empName= "Rajesh";
			e1.empID= 230;
			
			System.out.println("*** Details of Employee E1***");
			System.out.println(e1.empName);
			System.out.println(e1.empID);
			System.out.println(Employee.empOrg);
			
			}

}
