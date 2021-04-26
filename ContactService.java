package Contact;
import java.util.ArrayList;

public class ContactService {
	/* this contains a list of contacts */
	   private ArrayList<Contact> contacts;

	   /* default constructor */
	   public ContactService() {
	       contacts = new ArrayList<>();
	   }

	   /* adds contact */
	   public boolean add(Contact contact) {
	       /* present = true? */
	       boolean alreadyPresent = false;
	       for (Contact c : contacts) {
	           if (c.equals(contact)) {
	               alreadyPresent = true;
	           }
	       }
	       /*  Contact = present return true */
	       if (!alreadyPresent) {
	           contacts.add(contact);
	           System.out.println("Contact Added Successfully!");
	           return true;
	       } else {
	           System.out.println("Contact already present");
	           return false;
	       }
	   }

	   /*  remove a contact with given id  */
	   public boolean remove(String id) {
	       for (Contact c : contacts) {
	           if (c.getId().equals(id)) {
	               contacts.remove(c);
	               System.out.println("Contact removed Successfully!");
	               return true;
	           }
	       }
	       System.out.println("Contact not present");
	       return false;
	   }
}
