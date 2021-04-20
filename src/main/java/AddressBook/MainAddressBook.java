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
				case 's': //search for specific contact
				{


					boolean repeat2 = true; //repeats the Search Menu
					boolean haveContact = false; //switches to true when a contact is found
					//Create a new contact, MyContact will be set to the described contact when it is found,
					//so the parameters don't matter
					Contact MyContact = new Contact("Default","Contact","1112223333");

					while (repeat2)
					{
						//present Search Menu Options
						System.out.println("Search by (P)hone or (N)ame? (B)ack");
						//Read user input and store as string
						String userOrder = scanner.nextLine().toLowerCase();
						if (userOrder.equals(""))userOrder = " "; //handles empty string cornercase
						//Read first character and store as char for ease of use
						char orderChar = userOrder.charAt(0);
						switch (orderChar)
						{
							case 'b': //exit
							{
								repeat2 = false;//prevents Search Menu from reappearing
								haveContact = false;//prevents
								System.out.println("Returning to Main Menu!");
								break;
							}

							case 'p':
							{
								System.out.println("input Mobile number");
								String mobileString = scanner.nextLine().toLowerCase();
								// MyContact = searchByMobile(mobileString);
								// below is equivalent method from AddressBook class
								try
								{
									//MyContact = list.searchByMobile(mobileString).get(0);
								}
								catch (Exception e)
								{
									System.out.println("Contact not found");
									continue;
								}
								haveContact = true;
								break;
							}
							case 'n':
							{
								System.out.println("input Name");
								String nameString = scanner.nextLine().toLowerCase();
								// MyContact = searchByName(nameString);
								// below is equivalent method from AddressBook class
								try
								{
									MyContact = list.searchByFirstName(nameString).get(0);
								}
								catch (Exception e)
								{
									System.out.println("Contact not found");
									continue;
								}
								haveContact = true;
								break;
							}
							default:
							{
								System.out.println("invalid input");
								break;
							}
						}
						if(haveContact)
						{

							boolean repeat3 = true;
							while (repeat3)
							{
								System.out.println("Contact info: ");
								System.out.println(MyContact.toString()); // Steve wrapped this in a println
								System.out.println("\n (C)hange - (D)elete - (E)xit");

								String userCDE = scanner.nextLine().toLowerCase();
								if (userCDE.equals(""))userCDE = " ";
								char cdeChar = userCDE.charAt(0);
								switch (cdeChar)
								{

									case 'e': //exit
									{
										repeat3 = false;
										System.out.println("Goodbye!");
										break;
									}

									case 'c': //change
									{
										//changeContact(MyContact, scanner);
										System.out.println("Contact Changed");
										break;
									}
									case 'd': //delete
									{
										//deleteContact(MyContact,addressBook);
										list.remove(MyContact);
										System.out.println("Contact Deleted");
										repeat3 = false;
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

					break;
				}
				// end of search
				default:
				{
					System.out.println("invalid input");
					break;
				}
			}
		}


	}

}
