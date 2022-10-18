package milestoneThree; 

public class Contact 
{
	// Private members of the class Contact
	private String numID; 
	private String firstName;
	private String lastName;
	private String number;
	private String address;

	public Contact(String idnum, String first, String last, String num, String street) 
	{ 
		// Here I check to make sure the variables are not null and that the digits and characters are 10 or less.
		
		if(first.length() > 10) 
		{
			throw new IllegalArgumentException("Error: First name needs to have less than or equal to 10 characters.");
		}
		
		else if (first == null)
		{		
			throw new IllegalArgumentException("Error: First name can not be empty.");
		}
		
		if(num.length() > 10) 
		{
			throw new IllegalArgumentException("Error: Telephone number needs to have less than or equal to 10 characters.");
		}
		
		else if (num == null)
		{		
			throw new IllegalArgumentException("Error: Telephone can not be empty.");
		}
		
		if(street.length() > 10) 
		{
			throw new IllegalArgumentException("Error: Street name needs to have less than or equal to 10 characters.");
		}
		
		else if (street == null)
		{		
			throw new IllegalArgumentException("Error: Street name can not be empty.");
		}
		
		if(last.length() > 10) 
		{
			throw new IllegalArgumentException("Error: last name needs to have less than or equal to 10 characters.");
		}
		
		else if (last == null)
		{		
			throw new IllegalArgumentException("Error: last name can not be empty.");
		}
		
		if(idnum.length() > 10) 
		{
			throw new IllegalArgumentException("Error: Id number needs to have less than or equal to 10 characters.");
		}
		
		else if (idnum == null)
		{		
			throw new IllegalArgumentException("Error: Id number can not be empty.");
		}
		
		// If error handling passes, I then assign the paramerterized variables to my private member variables. 
		
		this.number = num; 
		
		this.lastName = last; 
		
		this.address = street;
		
		this.firstName = first; 
		
		this.numID = idnum; 
	}


		//These are the set methods that will set values for their respectable variables.
		
		public void setNumber(String num) 
		{ 
			this.number = num;
		}

		public void setLastName(String last) 
		{ 
			this.lastName = last;
		}
		
		public void setFirstName(String first) 
		{ 
			this.firstName = first;
		}

		public void setStreet(String street) 
		{ 
			this.address = street;
		}
		
		public void setIdNum(String idnum) 
		{ 
			this.numID = idnum;
		}


		//These are the get methods that will return values for their respectable variables.
		
		public String getNumber() 
		{ 
			return this.number;
		}
		
		public String getStreet() 
		{ 
			return this.address;
		}

		public String getLastName() 
		{ 
			return this.lastName;
		}
		
		public String getFirstName()
		{ 
			return this.firstName;
		}
		
		public String getIdNum() 
		{ 
			return this.numID;
		}

		
	public static void main(String args[]) 
	{
		// Create the object of class Contact and add in the default values for the program.
		Contact person = new Contact("123","Kyle","Raja","8906647785","6819 Silver Dr.");

		// This is printing method that will display the persons information.
		System.out.println(person.getIdNum()); 
		System.out.println(person.getFirstName()); 
		System.out.println(person.getLastName()); 
		System.out.println(person.getNumber()); 
		System.out.println(person.getStreet());

	}
}

