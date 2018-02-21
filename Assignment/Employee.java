package project;

public class Employee
{
int employeeid;
String employeename;
final static String designation="Trainer";

	public static void main(String[] args)
	{
	Employee E1=new Employee();
	E1.employeeid=1;
	E1.employeename="navneet";
	System.out.println(E1.employeeid);
	System.out.println(E1.employeename);
	System.out.println(Employee.designation);
	Employee E2=new Employee();
	E2.employeeid=2;
	E2.employeename="sukh";
	System.out.println(E2.employeeid);
	System.out.println(E2.employeename);
	System.out.println(Employee.designation);
	}
}
