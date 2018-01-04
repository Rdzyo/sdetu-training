package dataStructures; 

public class Arrays {

	public static void main(String[] args) {
		String[] alphabet = {"a", "b", "c", "d", "e", "f"};
		
		System.out.println("Alphabet");
		for(int i = 0; i<alphabet.length;i++) {
			System.out.print(alphabet[i] + " ");
	}
	
		System.out.println("\n\nUsing For-Each");
	for(String letter : alphabet) {
		System.out.print(letter + " ");
	}
	
	System.out.println("\n");
	String[][] users = {
			{"John","Williams","jw@testmail.com","172481427"},
			{"Sarah","Jackson","sj@testmail.com","129381928"},
			{"Rachel","Wallace","rc@testmail.com","837428743"}
						};
	
	// Get the size of array
	int numOfUsers = users.length;
	int numOfFields = users[0].length;
	System.out.println("Number of users: " + numOfUsers);
	System.out.println("Number of fields: " + numOfFields);
	for(String[] user : users) {
		System.out.print("[ ");
		for(String field : user) {
			System.out.print(field + " ");
		}
		System.out.println(" ]");
	}
}
}