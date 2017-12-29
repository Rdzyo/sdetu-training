package basics;

public class SalaryCalculator {
	public static void main(String[] args)
	{
		// Let's create a var to define our career
		
		// Declare a var
		String career;
		System.out.println("Program is starting");
		career = "Software developer";
		System.out.println("My career is: " + career);
		
		// Declare & Define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		career = "Web Developer";
		
		double salary = rate * hoursPerWeek * weeksPerYear;
		System.out.println("My salary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
		
		// Computer our annual salary
		// rate * hoursPerWeek * weeksPerYear
	}
}
