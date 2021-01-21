
public class Person {
	String firstname, lastname, address;
	int zipcode, phonenumber;
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	public String getLastName() {
		return lastname;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAdress() {
		return address;
	}
	
	public void setZipCode(int zipcode) {
		this.zipcode = zipcode;
		
	}
	
	public int getZipCode() {
		return zipcode;
	}
	
	public void setPhoneNumber(int phonenumber) {
		this.phonenumber = phonenumber;
		
	}
	
	public int getPhoneNumber() {
		return phonenumber;
	}
	
	public String getAll() {
		return "\nFirst name: " +  firstname + "\nLast name: " + lastname + "\nAddress: " + address + "\nZipcode: " + zipcode
				 + "\nPhone number: " + phonenumber;
	}

	

}
