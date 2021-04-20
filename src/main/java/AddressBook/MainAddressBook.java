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
				case 'a': //add new contact
				{

					//Read the user input and store as strings
					System.out.println("Input First Name: ");
					String userFirstName = scanner.nextLine();
					System.out.println("Input Last Name: ");
					String userLastName = scanner.nextLine();
					System.out.println("Input Mobile Number: ");
					String userMobile = scanner.nextLine();
					//create a new contact using the strings read from the user
					Contact userContact = new Contact(userFirstName,userLastName,userMobile);
					list.add(userContact);

					System.out.println(userContact.getFullName() + " added");

					break;
				}
				case 'p': //print all contacts
				{


					list.displayContacts(); // Method defined in AddressBook
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
