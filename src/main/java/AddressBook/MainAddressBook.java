package AddressBook;

public class MainAddressBook {
	public static void main(String[] args) {
		Contact bob = new Contact("Bob", "Ross","555555555");
		System.out.println(bob.getFullName());
		AddressBook list = new AddressBook();
		list.add(bob);

		//System.out.println(list);
		list.displayContacts();


	}
}
