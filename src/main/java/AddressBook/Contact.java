package AddressBook;

public class Contact {
	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String homeNumber;
	private String email;
	private String street;
	private String streetNumber;
	private String city;
	private String zip;

	public Contact(String firstName,String lastName,String mobileNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
	}

	public Contact(String[] fields) {
		this.firstName = fields[0];
		this.lastName = fields[1];
		this.mobileNumber = fields[2];
		this.homeNumber = fields[3];
		this.email = fields[4];
		this.street = fields[5];
		this.streetNumber = fields[6];
		this.city = fields[7];
		this.zip = fields[8];

	}

	//getters/setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getHomeNumber() {
		return homeNumber;
	}

	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getFullName(){
		return this.firstName + " " + this.lastName;
	}
	public String getFullAddress(){
		return getStreetNumber() + " " + getStreet();
	}

	@Override
	public String toString()
	{
		String fullName = getFullName();
		String fullAddress = getFullAddress();
		return String.format("%-21s | %-10s | %-10s | %-20s | %-20s | %-15s | %-10s\n", fullName, mobileNumber, homeNumber, email,
				fullAddress, city, zip);
	}
}
