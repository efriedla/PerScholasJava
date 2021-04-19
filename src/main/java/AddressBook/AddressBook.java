package AddressBook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class AddressBook {
	private ArrayList<Contact> contactList;

	public AddressBook(){
		this.contactList = new ArrayList<>();
	}

	//add a new contact
	public void add(Contact contact) {
		this.contactList.add(contact);
	}
	//remove contact
	public void remove(Contact contact){
		this.contactList.remove(contact);
	}

	//Searching

	/**
	 * Find by firstname
	 * @param firstName
	 * @return all contacts that start with bob
	 */
	public ArrayList<Contact> searchByFirstName(String firstName)
	{
		// List to store matches
		ArrayList<Contact> matchingContacts = new ArrayList<>();

		// Search the list
		Iterator<Contact> iterator = contactList.listIterator();
		while (iterator.hasNext())
		{
			Contact next = iterator.next();
			if (next.getFirstName().trim().equalsIgnoreCase(firstName.trim()))
			{
				matchingContacts.add(next);
				System.out.println("Found "+ firstName);
			}
		}
		return matchingContacts;
	}
	public ArrayList<Contact> searchByLastName(String lastName)
	{
		//Stores match
		ArrayList<Contact> matchingContacts = new ArrayList<>();
		//Search
		Iterator<Contact> i = contactList.listIterator();
		while (i.hasNext())
		{
			Contact next = i.next();
			if(next.getLastName().trim().equalsIgnoreCase(lastName.trim()))
			{
				matchingContacts.add(next);
				System.out.println("Found " + lastName);
			}
		}
		return matchingContacts;
	}


//	public void displayContacts(int sortMethod)
	public void displayContacts()
	{
		// Determine sorting
//		Comparator<Contact> comparator;
//		switch (sortMethod)
//		{
//			case 1:
//				comparator = new CompareByFirstThenLastName();
//				break;
//			case 2:
//				comparator = new CompareByCity();
//				break;
//			default:
//				comparator = new CompareByFirstThenLastName();
//		}

		// Sort list
		//contactList.sort(comparator);

		// Display the data
		Iterator<Contact> iterator = contactList.iterator();
		System.out.println("Name                  |   Mobile   |   Phone    |        email         |" +
				" Street Address       |     City        |   Zip Code");
		System.out.println("------------------------------------------------------------------------" +
				"----------------------------------------------------");
		while (iterator.hasNext())
		{
			Contact contact = iterator.next();
			System.out.println(contact.toString());
		}
	}
}
