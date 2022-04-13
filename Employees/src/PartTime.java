/* Name Bailey Patt
 * Date: March 3, 2022
 * Description: Employee assignment on Inheritence
 */
public class PartTime extends Employee {

	private int hoursPerWeek;

	public PartTime(String name, double salary, String SSN, int hoursPerWeek) {
		super(name, salary, SSN);
		this.hoursPerWeek = hoursPerWeek;
	}

	@Override
	public double getPay() {
		this.salary = salary * hoursPerWeek * 2;
		return salary;
	}

}
