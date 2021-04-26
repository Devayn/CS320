
package ContactTest;
import Contact.ContactService;
import Contact.Contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	   public void testMethodAddPass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("1234", "David", "Liam","3334445555", "444 Rock ln");
	       Contact c2 = new Contact("4321", "jenny", "Liam","3334445555", "3 meadows dr");
	       Contact c3 = new Contact("5533", "James", "Liam","3334445555", "17 12th rd apt 1");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));
	   }

	   /* testing the add method */
	   @Test
	   public void testMethodAddFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("1234", "David", "Liam","3334445555", "444 Rock ln");
	       Contact c2 = new Contact("4321", "jenny", "Liam","3334445555", "3 meadows dr");
	       Contact c3 = new Contact("5533", "James", "Liam","3334445555", "17 12th rd apt 1");
	       assertEquals(true, cs.add(c1));
	       assertEquals(false, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));
	   }

	   /* test  delete method */
	   @Test
	   public void testMethodDeletePass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("1234", "David", "Liam","3334445555", "444 Rock ln");
	       Contact c2 = new Contact("4321", "jenny", "Liam","3334445555", "3 meadows dr");
	       Contact c3 = new Contact("5533", "James", "Liam","3334445555", "17 12th rd apt 1");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c2));
	       assertEquals(true, cs.add(c3));

	       assertEquals(true, cs.remove("5533"));
	       assertEquals(true, cs.remove("4321"));
	   }

	   /* test the delete method */
	   @Test
	   public void testMethodDeleteFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("1234", "David", "Liam","3334445555", "444 Rock ln");
	       Contact c2 = new Contact("4321", "jenny", "Liam","3334445555", "3 meadows dr");
	       Contact c3 = new Contact("5533", "James", "Liam","3334445555", "17 12th rd apt 1");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));

	       assertEquals(false, cs.remove("8736"));
	       assertEquals(true, cs.remove("4321"));
	   }

	   /* test the update method */
	   @Test
	   public void testUpdatePass() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("1234", "David", "Liam","3334445555", "444 Rock ln");
	       Contact c2 = new Contact("4321", "jenny", "Liam","3334445555", "3 meadows dr");
	       Contact c3 = new Contact("5533", "James", "Liam","3334445555", "17 12th rd apt 1");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));

	       assertEquals(true, cs.update("5533", "Jack", "Dorot", ""));
	       assertEquals(true, cs.update("4321", "jennymy", "Liam","3334445555", "999 left right road"));
	   }

	   /* test the update method */
	   @Test
	   public void testUpdateFail() {
	       ContactService cs = new ContactService();
	       Contact c1 = new Contact("1234", "David", "Liam","3334445555", "444 Rock ln");
	       Contact c2 = new Contact("4321", "jenny", "Liam","3334445555", "3 meadows dr");
	       Contact c3 = new Contact("5533", "James", "Liam","3334445555", "17 12th rd apt 1");
	       assertEquals(true, cs.add(c1));
	       assertEquals(true, cs.add(c3));
	       assertEquals(true, cs.add(c2));

	       assertEquals(false, cs.update("8736", "Jack", "Dorot","3334445555", ""));
	       assertEquals(true, cs.update("4321", "jennymy", "Liam", "999 left right road"));
	   }
}
