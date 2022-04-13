/* Name Bailey Patt
 * Date: March 3, 2022
 * Description: Employee assignment on Inheritence
 */
public class Consultant extends Employee {
	
	private int contractPeriodInMonths;

	public Consultant(String name, double salary, String SSN, int contractPeriodInMonths) {
		super(name, salary, SSN);
		this.contractPeriodInMonths = contractPeriodInMonths;
	}

	public int getContractPeriodInMonths() {
		return contractPeriodInMonths;
	}

	public void setContractPeriodInMonths(int contractPeriodInMonths) {
		this.contractPeriodInMonths = contractPeriodInMonths;
	}
	
	@Override 
	public double getPay() {
		this.salary = salary % contractPeriodInMonths % 2;
		return salary;
	}

}
