package tests;
/**
 * CS-320 Project One 
 * Harshilkumar Jayswal
 * @SNHU 2023
 */

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import contactService.ContactService;

class ContactServiceTest {
	
	
	// Clearing the array list after each test
	@AfterEach
	void clearArray() throws Exception {
		ContactService.contactList.clear();
	}

	// Testing addContact
	@Test
	void testAddContact() {

		String firstName = "Robert";
		String lastName = "Hoffman";
		String phoneNumber = "5555666678";
		String address = "567 Main Street";

		ContactService test = new ContactService();

		assertTrue(ContactService.contactList.isEmpty());

		test.addContact(firstName, lastName, phoneNumber, address);

		assertFalse(ContactService.contactList.isEmpty());
		assertEquals(0, ContactService.contactList.get(0).getContactID());
		assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		assertEquals(phoneNumber, ContactService.contactList.get(0).getPhoneNumber());
		assertEquals(address, ContactService.contactList.get(0).getAddress());

	}
	
	// Testing deleteContact			  
	@Test void testDeleteContact() {
				  
		String firstName = "Robert";
		String lastName = "Hoffman";
		String phoneNumber = "5555666678";
		String address = "567 Main Street";
		boolean testBool = false;
		  
		ContactService test = new ContactService();
		  
		assertTrue(ContactService.contactList.isEmpty());
		 
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 0
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 1
		test.addContact(firstName, lastName, phoneNumber, address);//object at ID 2
		  
		assertEquals(3,ContactService.contactList.size());
		  
		test.deleteContact("1");
		  
		assertEquals(2,ContactService.contactList.size());
		 
		//loop through to look for ID
		for(int i = 0; i < ContactService.contactList.size(); i++) {
			if(ContactService.contactList.get(i).getContactID() == 1) {
				testBool = true;
			}
		}		
		assertFalse(testBool);				 
	}
	
	// Testing adding Multiple contacts			  
		@Test void testAddMultipleContacts() {
					  
			String firstName = "Robert";
			String lastName = "Hoffman";
			String phoneNumber = "5555666678";
			String address = "567 Main Street";
						  
			ContactService test = new ContactService();
	 
			test.addContact(firstName, lastName, phoneNumber, address);//object at ID 0
			test.addContact(firstName, lastName, phoneNumber, address);//object at ID 1
			test.addContact(firstName, lastName, phoneNumber, address);//object at ID 2
			
			assertEquals(3,ContactService.contactList.size());
			  
					 
		}
	
		
	// Testing editing a first name
		@Test
		void testEditFirst() {
			
			String firstName = "Robert";
			String lastName = "Hoffman";
			String phoneNumber = "5555666678";
			String address = "567 Main Street";

			ContactService test = new ContactService();
			test.addContact(firstName, lastName, phoneNumber, address);
			
			assertEquals(firstName, ContactService.contactList.get(0).getFirstName());
			
			test.editFirstName("0", "Test_First");
			assertEquals("Test_First", ContactService.contactList.get(0).getFirstName());
		}
	
	// Testing editing a last name
	@Test
	void testEditLast() {
		
		String firstName = "Robert";
		String lastName = "Hoffman";
		String phoneNumber = "5555666678";
		String address = "567 Main Street";
		  
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(lastName, ContactService.contactList.get(0).getLastName());
		
		test.editLastName("0", "Test_Name");
		assertEquals("Test_Name", ContactService.contactList.get(0).getLastName());
	}
	
	   // Testing editing a phone number
		@Test
		void testEditPhone() {
			
			String firstName = "Robert";
			String lastName = "Hoffman";
			String phoneNumber = "5555666678";
			String address = "567 Main Street";
			  
			ContactService test = new ContactService();
			test.addContact(firstName, lastName, phoneNumber, address);
			
			assertEquals(phoneNumber, ContactService.contactList.get(0).getPhoneNumber());
			
			test.editPhone("0", "1987654321");
			assertEquals("1987654321", ContactService.contactList.get(0).getPhoneNumber());
		}
	
	// Testing editing an address
	@Test
	void testEditAddress() {
		
		String firstName = "Robert";
		String lastName = "Hoffman";
		String phoneNumber = "5555666678";
		String address = "567 Main Street";
		
		ContactService test = new ContactService();
		test.addContact(firstName, lastName, phoneNumber, address);
		
		assertEquals(address, ContactService.contactList.get(0).getAddress());
		
		test.editAddress("0", "Test_Address");
		assertEquals("Test_Address", ContactService.contactList.get(0).getAddress());
	}
}

