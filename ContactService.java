package contactService;
/**
 * CS-320 Project One 
 * Harshilkumar Jayswal
 * @SNHU 2023
 */

import java.util.List;
import java.util.ArrayList;


public class ContactService {
	
	int currentIDNum = 0; //defaulting currentID to zero at the start

	//create new arraylist to hold the objects
	public static List<Contact> contactList = new ArrayList<Contact>();
	

	// Method to add a contact at the system controlled index id
	
	public void addContact(String firstName, String lastName,
			String phoneNumber, String address) {
		
		String stringID = Integer.toString(currentIDNum);
		
		Contact newContact = new Contact(stringID, firstName, lastName, phoneNumber, address);
		contactList.add(newContact.getContactID(),newContact);
		
		// increment the ID number by 1
		++currentIDNum;

	}
	
	
	// Method to delete the contact as the index ID
	public void deleteContact(String ID) {
		int intID = Integer.valueOf(ID);


		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == intID) {
				contactList.remove(i);
			}
		}
	}
	
	
	// Method to edit First Name of the Contact Object at contactID
	public void editFirstName(String contactID, String firstName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setFirstName(firstName);				
			}			
		}	
	}
	
	// Method to edit Last Name of the Contact Object at contactID
	public void editLastName(String contactID, String lastName) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setLastName(lastName);				
			}			
		}	
	}
	
	// Method to edit Phone number of the Contact Object at contactID
	public void editPhone(String contactID, String phoneNumber) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setPhoneNumber(phoneNumber);				
			}			
		}	
	}
	
	// Method to edit Address of the Contact Object at contactID
	public void editAddress(String contactID, String address) {
		for(Contact iter : contactList) {
			if(iter.getContactID() == Integer.valueOf(contactID)) {
				iter.setAddress(address);				
			}			
		}	
	}

}
