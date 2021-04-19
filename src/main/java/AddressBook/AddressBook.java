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
