package day2;
class Department extends Object
{
	
}
class HR extends Department
{
	
}
class Manager extends Object {
	int projectId=100;
	public Manager() {
		System.out.println("1. Manager cons called");
	}
	public Manager(String name) {
		System.out.println("1. Manager param cons called");
	}
	 public int allocateProject() {
		System.out.println("Project allocated by manager");
		return (Integer) null;
	}
	 public void paySalary() {
		 System.out.println("Manager paid salry to employees");
	 }
	 
	 @Override
	protected void finalize() throws Throwable {
		System.out.println("FINZALIZE OF MANAGER");
	}
}
class Employee extends Manager 
{
	int projectId=200;
	public Employee() {
		System.out.println("2. Employee cons called");
		int projectId= 300;
		System.out.println(projectId);
		System.out.println(this.projectId);
		System.out.println(super.projectId);
	}
	public Employee(String name) {
		super(name);
		System.out.println("2. Employee param called");
		int projectId= 300;
		System.out.println(projectId);
		System.out.println(this.projectId);
		System.out.println(super.projectId);
	}
	public void takeLeave() {
		System.out.println("Employee taken Leave");
	}
	//overriding
	public int allocateProject() {
		System.out.println("Project allocated by manager in a special way");
		return 0;
	}

}
class Clerk extends Manager
{
	@Override
	public int allocateProject() {
		System.out.println("Clerk allocated project ");
		return projectId;
	}

}
public class DemoInheritance {

	public static void main(String[] args) {
		//way 1
		System.out.println("Way 1");
		Employee emp = new Employee("Neha");
		emp.allocateProject();
		emp.takeLeave();
		Clerk clerk = new Clerk();
		clerk.allocateProject();
		//way 2
		System.out.println("Way 2");
		Manager manager = new Employee();
		manager.allocateProject();
		manager = new Clerk();
		manager.allocateProject();
		manager = null;
		
	}
}

