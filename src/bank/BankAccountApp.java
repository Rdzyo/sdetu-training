package bank;

public class BankAccountApp {

	public static void main(String[] args) {
		BankAccount acc1 = new BankAccount("465329874", 1000);
		BankAccount acc2 = new BankAccount("124153763", 2000);
		BankAccount acc3 = new BankAccount("643636312", 2500);
		
		acc1.setName("Jim");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(1000);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements IInterest
{
	private static int iD = 1000;				  // Internal ID
	private String accountNumber; // iD + random 2-digit nr + first 2 SSN numbers 
	private static final String routingNumber = "005400657";
	private String name;
	private String SSN;
	private double balance;
	
		//Constructors
		public BankAccount(String SSN, double initDeposit)
		{
			 balance = initDeposit;
			 //System.out.println("New Account Created");
			 this.SSN = SSN;
			 iD++;
			 setAccountNumber();
		}
		private void setAccountNumber()
		{
			int random = (int) (Math.random() * 100);
			accountNumber = iD + "" + random + SSN.substring(0, 2);
			System.out.println("Your account number is: " + accountNumber);
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		public String getName()
		{
			return name;
		}
		public void payBill(double amount)
		{
			balance = balance - amount;
			System.out.println("Paying bill: " + amount);
			showBalance();
		}
		public void makeDeposit(double amount)
		{
			balance = balance + amount;
			System.out.println("Making deposit: " + amount);
			showBalance();
		}
		public void showBalance()
		{
			System.out.println("Balance: " + balance);
		}
		public void accrueInterest()
		{
			
		}
		public void accrue()
		{
			balance = balance * (1 + rate/100);
			showBalance();
		}
		public String toString()
		{
			return "[Name: " + name + " ] \n[Account Number: " + accountNumber + " ]\n" + "[Routing number: " + routingNumber + " ]\n" + "[Balance: " + balance + "]";
		}
		
	}
