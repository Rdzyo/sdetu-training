package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if(bookTitle.contains(wordChoice))
		{
			System.out.println("The book contains the word " + wordChoice);
		}

		String browser = "Chrome";
		// ignore ma³ej/du¿ej litery
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("The browser is chrome");
		}
		
		String firstName = "Tim";
		String lastName = "Short";
		String SSN = "984162168";
		
		System.out.println("There are " + SSN.length() + "digits in your SSN.");
		
		// Print the initials plus last 4 digits of SSN
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3));
		System.out.print(SSN.substring(5));
	}

}
