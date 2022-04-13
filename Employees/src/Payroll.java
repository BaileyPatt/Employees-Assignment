/* Name Bailey Patt
 * Date: March 3, 2022
 * Description: Employee assignment on Inheritence
 * Main Method Class
 */
import java.util.Scanner;

public class Payroll {
	
	static Employee[] employee = new Employee[6];
	
	public static void main(String[] args) {
		
		int count = 0;
		int userChoice;
		Employee newEmployee;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Name: ");
		String name = sc.nextLine();
		
		System.out.println("Enter your Salary: ");
		double salary = sc.nextDouble();
		
		System.out.println("Enter your Social Security Number: ");
		String SSN = sc.nextLine();
	
		do {
			
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("What type of employee are you? ");
			
			System.out.println(printMenu());
			
			userChoice = input.nextInt();
			
			
			if (userChoice == 1) {
				FullTime Employee = new FullTime (name, salary, SSN);
				
			}
			
			else if (userChoice == 2) {
				
				System.out.println("Enter the ammount of hours you work per week: ");
				int hoursPerWeek = input.nextInt();
				
				PartTime Employee = new PartTime (name, salary, SSN, hoursPerWeek);
				
			}
			
			else if (userChoice == 3) {
				
				System.out.println("Enter the ammount of hours that you work per week: ");
				int hoursPerWeek = input.nextInt();
				
				System.out.println("Enter the University that you attend: ");
				String university = input.nextLine();
				
				System.out.println("Are you being paid? ");
				boolean isPaid = input.nextBoolean();
				
				Intern Employee = new Intern (name, salary, SSN, hoursPerWeek, university, isPaid);
			}
			
			else if (userChoice == 4 ) {
				
				System.out.println("Enter the period of your contract in months: ");
				int contractPeriodInMonths = input.nextInt();
				
				Consultant Employee = new Consultant (name, salary, SSN, contractPeriodInMonths);
			}
			
			}	while (userChoice != 0 && userChoice != 6 );
				
			
		
		

	}

	public static String printMenu() {
		
		return ("Employee Types: " + "\n1. Full Time: " + "\n2. Part Time: " + "\n3. Intern: " + "\n4. Consultant: " + "\n0. Exit System ");
		
	}
	
		
}
