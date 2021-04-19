package AddressBook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
	private ArrayList<Contact> contactList;

	public AddressBook(){
		this.contactList = new ArrayList<>();
		readData();
	}

	//add a new contact
	public void add(Contact contact) {
		this.contactList.add(contact);
	}
	//remove contact
	public void remove(Contact contact){
		this.contactList.remove(contact);
	}
	//adding CSV
	private ArrayList<Contact> readData()
	{

		try
		{
			File csvFile = new File("filename.txt");
			Scanner scanner = new Scanner(csvFile);
			scanner.nextLine(); // Discard the header row

            /*
            Read row, split on comma, create new Contact
            and add to the ArrayList
             */
			while (scanner.hasNextLine())
			{
				String entry = scanner.nextLine();
				String[] entryFields = entry.split(",");
				// If a row is not formed correctly or blank, skip the line
				if (entryFields.length != 9)
				{
					continue;
				}
				contactList.add(new Contact(entryFields));
			}
			scanner.close();
		}
		catch ( FileNotFoundException e)
		{
			System.out.println("File not found");
		}

		// Sort the list alphabetically after loading
		//contactList.sort(new CompareByFirstThenLastName());
		return contactList;
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
