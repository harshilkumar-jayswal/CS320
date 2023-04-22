package contactService;
/**
 * CS-320 Project One 
 * Harshilkumar Jayswal
 * @SNHU 2023
 */

public class Contact {
	
	// Contact objects to store the data
	private String contactID;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;	
	
	// Method to validate ID 
	private final boolean validateID(String contactID) {
		if(contactID == null || contactID.length() > 10) {
			return false;			
		}		
		return true;
	}
	
	// Method to validate LastName 
	private final boolean validateLastName(String lastName) {
		if(lastName == null || lastName.length() > 10) {
			return false;			
		}
		return true;
	}
	
	// Method to validate FirstName 
	private final boolean validateFirstName(String firstName) {
		if(firstName == null || firstName.length() > 10) {	
			return false;			
		}
		return true;
	}
	
	// Method to validate Phone
	private final boolean validatePhone(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length() != 10) {
			return false;			
		}
		return true;
	}
	
	// Method to validate Address 
	private final boolean validateAddress(String address) {
		if(address == null || address.length() > 30) {
			return false;			
		}
		return true;
	}
	
	// Constructor for the contact class
	public Contact(String contactID, 
			String firstName, 
			String lastName, 
			String phoneNumber, 
			String address) {
		
		// Throw Exception if ID is not valid 
		if(!this.validateID(contactID)) {
			throw new IllegalArgumentException("Invalid contact ID");
		}
		// Throw Exception if FirstName is not valid 
		if(!this.validateFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid first name");
		}
		// Throw Exception if LastName is not valid 
		if(!this.validateLastName(lastName)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		// Throw Exception if Phone is not valid 
		if(!this.validatePhone(phoneNumber)) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		// Throw Exception if Address is not valid 
		if(!this.validateAddress(address)) {
			throw new IllegalArgumentException("Invalid address");
		}		
		
		// Setting the input after all validation passed
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	// Getter for ContactID
	public int getContactID() {
		return Integer.valueOf(contactID);
		//return contactID; 
	}

	
	// Getter for FirstName
	public String getFirstName() {
		return firstName;
	}
	
	// Setter for firstName with call to validation
	public void setFirstName(String firstName) {
		if(!this.validateFirstName(firstName)) {
			throw new IllegalArgumentException("Invalid first name");
		}
		this.firstName = firstName;
	}

	// Getter for lastName
	public String getLastName() {
		return lastName;
	}

	// Setter for lastName with call to validation
	public void setLastName(String lastName) {
		if(!this.validateLastName(lastName)) {
			throw new IllegalArgumentException("Invalid last name");
		}
		this.lastName = lastName;
	}

	// Getter for PhoneNumber
	public String getPhoneNumber() {
		return phoneNumber;
	}

	// Setter for PhoneNumber with call to validation
	public void setPhoneNumber(String phoneNumber) {
		if(!this.validatePhone(phoneNumber)) {
			throw new IllegalArgumentException("Invalid phone number");
		}
		this.phoneNumber = phoneNumber;
	}
	
	// Getter for Address
	public String getAddress() {
		return address;
	}
	
	// Setter for Address with call to validation
	public void setAddress(String address) {
		if(!this.validateAddress(address)) {
			throw new IllegalArgumentException("Invalid address");
		}	
		this.address = address;
	}

}
