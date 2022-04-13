/* Name Bailey Patt
 * Date: March 3, 2022
 * Description: Employee assignment on Inheritence
 */

public abstract class Employee {

	protected String name;
	protected double salary;
	protected String SSN;
	protected final int employeeID;
	static int nextId = 1;

	public Employee(String name, double salary, String SSN) {
		super();
		this.name = name;
		this.salary = salary;
		this.SSN = SSN;
		this.employeeID = nextId++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String SSN) {
		this.SSN = SSN;
	}

	public static int getNextId() {
		return nextId;
	}

	public static void setNextId(int nextId) {
		Employee.nextId = nextId;
	}

	public int getEmployeeId() {
		return this.employeeID;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", SSN=" + SSN + ", employeeID=" + employeeID + "]";
	}

	public abstract double getPay();

}
