package JavaTest;

public class NewTest {
	
	   String name;
	   int age;
	   String designation;
	   double salary;

	   // This is the constructor of the class NewTest
	   public NewTest(String name) {
	      this.name = name;
	   }

	   // Assign the age of the Employee  to the variable age.
	   public void empAge(int empAge) {
	      age = empAge;
	   }

	   /* Assign the designation to the variable designation.*/
	   public void empDesignation(String empDesig) {
	      designation = empDesig;
	   }

	   /* Assign the salary to the variable	salary.*/
	   public void empSalary(double empSalary) {
	      salary = empSalary;
	   }

	   /* Print the Employee details */
	   public void printNewTest() {
	      System.out.println("Name:"+ name );
	      System.out.println("Age:" + age );
	      System.out.println("Designation:" + designation );
	      System.out.println("Salary:" + salary);
	   }
	// Invoking methods for each object created
	   public static void main(String []args) {
		   NewTest empName = new NewTest("Vishal");
		   empName.empAge( 21 );
		   empName.empDesignation("Manage");
		   empName.empSalary(60000);
		   empName.printNewTest();
		   		   		   		   
	   }
	}