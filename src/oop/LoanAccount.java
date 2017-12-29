package oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("rate");
		
	}

	@Override
	public void increaseRate() {
		System.out.println("Increase rate");
		
	}
	
	public void setTerm(int term)
	{
		System.out.println("Setting term to: " + term + " years.");
	}
	public void setAmmortSchedule()
	{
		System.out.println("Ammortization schedule");
	}

}
