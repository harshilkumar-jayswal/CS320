package tests;
/**
 * CS-320 Project One 
 * Harshilkumar Jayswal
 * @SNHU 2023
 */

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import contactService.Contact;



class ContactTest{

	// Testing with valid input	
	@Test
	public void testWithValidInput() {
        String contactId = "1";
      	String firstName = "Dan";
        String lastName = "Wright";
        String phoneNumber = "5555666678";
        String address = "441 Baker St.";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        
		assertEquals(1, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
	}
	
	// Testing with invalid input, using invalid phone
	@Test
	public void testWithInvalidInput() {
        String contactId = "2";
      	String firstName = "Jonathan";
        String lastName = "Hoffman";
        String phoneNumber = "AA1234B";
        String address = "1234 North Avenue";       
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	// Testing with valid firstName
	@Test
	public void testWithValidFirstname() {
        String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setFirstName("George");        
        assertEquals("George", testContact.getFirstName());
	}
	
	
	// Testing with null firstName
	@Test
	public void testWithNullFirstname() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
	
	
	// Test with invalid length FirstName
	@Test
	public void testWithLongFirstName() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("ThisFirstNameIsTooLong");
        });
	}
	

	// Testing contactId with a good constructor then evaluate that an integer is returned
	@Test
	public void testWithValidContactID() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals(3, testContact.getContactID());
	}
	
	// Testing contactId with a good constructor then evaluate that a String is not returned
	@Test
	public void testWithInvalidContactID() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertNotEquals("5", testContact.getContactID());
	}
	
	
	 // Testing contactID by using an long character length
	@Test
	public void testWithLongContactID() {
        String contactId = "1234567891234567";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	
	// Testing invalid null lastName
	@Test
	public void testWithInvalidNullLastName() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
	
	// Testing lastName with invalid lastName length
	@Test
	public void testWithInvalidLongLastName() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("ThisLastNameIsTooLong");
        });
	}
	
	
	// Test with a valid LastName
	@Test
	public void testWithValidLongLastName() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Kawthorn");        
        assertEquals("Kawthorn", testContact.getLastName());
	}
	
	//Test an invalid null setPhoneNumber
	@Test
	public void testWithInvalidNullPhone() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber(null);
        });
        
	}
	
	//Test an invalid length setPhoneNumber
	@Test
	public void testWithInvalidLengthPhone() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("123");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("123456789123456789");
        });
	}
	
	//Test with a valid length PhoneNumber
	@Test
	public void testWithValidLengthPhone() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setPhoneNumber("5557778889");        
        assertEquals("5557778889", testContact.getPhoneNumber());

	}
	
	//Test an invalid null setAddress")
	@Test
	public void testWithNullAddress() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
	//Test an invalid length setPhoneNumber
	@Test
	public void testWithWrongLengthAddress() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("123456789 Valley Ranch Scenic Dr North Ave Street");
        });
	}
	
	//Test a valid length setAddress
	@Test
	public void testWithGoodAddress() {
		String contactId = "3";
      	String firstName = "Robert";
        String lastName = "Hoffman";
        String phoneNumber = "5555666678";
        String address = "567 Main Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("123 Main Street");        
        assertEquals("123 Main Street", testContact.getAddress());

	}
	
}
