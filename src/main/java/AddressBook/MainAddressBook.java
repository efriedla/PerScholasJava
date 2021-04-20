package AddressBook;

import java.util.Scanner;

public class MainAddressBook {
	public static void main(String[] args) {
		Contact bob = new Contact("Bob", "Ross","555555555");
		System.out.println(bob.getFullName());
		AddressBook list = new AddressBook();
		list.add(bob);
		list.displayContacts();
		list.searchByFirstName("mary");

		Scanner scanner = new Scanner(System.in);

		boolean repeat1 = true;
		while (repeat1){
			//Greet the user
			System.out.println("Hello welcome to the address book!");
			//present Main Menu options
			System.out.println("(A)dd - (P)rint All - (S)earch - (E)xit");
			//read user input
			String userInput = scanner.nextLine().toLowerCase(); //ignore case
			if (userInput.equals(""))userInput = " "; //change empty strings to a single space to avoid exception
			char usrInChar = userInput.charAt(0); // read the first character for ease of use
			System.out.println("userInput: "+userInput); //print back what the user typed for confirmation
			switch (usrInChar)
			{
				case 'e': //exit
				{
					repeat1 = false;
					//setting repeat1 to false ends the outermost loop and thus ends the program
					System.out.println("Goodbye!");
					break;
				}
				default:
				{
					System.out.println("invalid input");
					break;
				}
			}
		}


	}

}
