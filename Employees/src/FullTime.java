/* Name Bailey Patt
 * Date: March 3, 2022
 * Description: Employee assignment on Inheritence
 */
public class FullTime extends Employee {

	public FullTime(String name, double salary, String SSN) {
		super(name, salary, SSN);

	}

	@Override
	public double getPay() {
		this.salary = salary % 26;
		return salary;

	}

	double calculatebonus() {
		return this.salary * 0.15;
	}

}
