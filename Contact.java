package Contact;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNum;
	private String address;
	
	public Contact(String id, String firstName, String lastName, String phoneNum, String address) {
		
		if (id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid Id");
		}
		
		if ( firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		
		if ( lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		
		if (phoneNum == null || phoneNum.length() > 10 ) {
			throw new IllegalArgumentException("Invalid Phone Number");
		}
		
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNum = phoneNum;
		this.address = address;
		
				
	}
	public String getId() {
	       return id;
	   }

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

	   public String getAddress() {
	       return address;
	   }

	   public void setAddress(String address) {
	       this.address = address;
	   }
	   
	   @Override
	   public boolean equals(Object obj) {
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (getClass() != obj.getClass())
	           return false;
	       Contact other = (Contact) obj;
	       if (id == null) {
	           if (other.id != null)
	               return false;
	       } else if (!id.equals(other.id))
	           return false;
	       if (firstName == null) {
	           if (other.firstName != null)
	               return false;
	       } else if (!firstName.equals(other.firstName))
	           return false;
	       if (lastName == null) {
	           if (other.lastName != null)
	               return false;
	       } else if (!lastName.equals(other.lastName))
	           return false;
	       if (address == null) {
	           if (other.address != null)
	               return false;
	       } else if (!address.equals(other.address))
	           return false;
	       return true;
	   }
	   
	   @Override
	   public boolean equals(Object obj) {
	       if (this == obj)
	           return true;
	       if (obj == null)
	           return false;
	       if (getClass() != obj.getClass())
	           return false;
	       Contact other = (Contact) obj;
	       if (id == null) {
	           if (other.id != null)
	               return false;
	       } else if (!id.equals(other.id))
	           return false;
	       if (firstName == null) {
	           if (other.firstName != null)
	               return false;
	       } else if (!firstName.equals(other.firstName))
	           return false;
	       if (lastName == null) {
	           if (other.lastName != null)
	               return false;
	       } else if (!lastName.equals(other.lastName))
	           return false;
	       if (address == null) {
	           if (other.address != null)
	               return false;
	       } else if (!address.equals(other.address))
	           return false;
	       return true;
	   }

}
