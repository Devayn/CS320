package ContactTest;

import Contact.Contact;
import Contact.ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactTest {

	@Test
	void testForSuccess() {
		ContactService Contact = new ContactService();
		Contact Dave = new Contact("1234", "David", "Smith", "1234562323", " 1208 Wall st");
		assertEquals(true, Contact.add(Dave));
		
	}
	
	@Test
	void testForFail() {
		ContactService Contact = new ContactService();
		Contact BadDave = new Contact("1234", "David's name is too long", "Smith", "1234562323", " 1208 Wall st");
		
		assertEquals(false, Contact.add(BadDave));
	}

}
