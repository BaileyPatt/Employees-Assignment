/* Name Bailey Patt
 * Date: March 3, 2022
 * Description: Employee assignment on Inheritence
 */
public class Intern extends Employee {

	private int hoursPerWeek;
	private String university;
	private boolean isPaid;

	public Intern(String name, double salary, String SSN, int hoursPerWeek, String university, boolean isPaid) {
		super(name, salary, SSN);
		this.hoursPerWeek = hoursPerWeek;
		this.university = university;
		this.isPaid = isPaid;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	@Override
	public double getPay() {

		if (this.isPaid) {

			this.salary = salary * hoursPerWeek * 2;

			return salary;
		} else {
			return 0.0;
		}
	}

}
