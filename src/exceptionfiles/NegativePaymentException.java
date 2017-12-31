package exceptionfiles;

public class NegativePaymentException extends Exception {
	// Define class var
	double payment;
	
	// 1. Constructor that takes the value that would throw the exception
	// 2. Assign value of local var class var
	public NegativePaymentException(double payment)
	{
		this.payment = payment;
		//System.out.println("ERROR: Negative payment");
	}
	// Override the toString() method to include the specific exception msg
	public String toString()
	{
		return "Error: Cannot take negative payment " + payment;
	}
}
