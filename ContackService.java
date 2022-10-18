package milestoneThree;
import java.util.*;

public class ContactService
{
	private ArrayList<Contact> peopleDirectory; 
	
	public ContactService() 
	{
		peopleDirectory = new ArrayList<>();
	}

	//This function updates the person information and returns true or false.
	public boolean refreshPersonInfo(String personID, String firstName, String lastName, String telephoneNum, String address) 
	{
		for(Contact p:peopleDirectory) 
		{ 
			if(p.getContactID().equals(personID)) 
			{
				if(!(telephoneNum.length() > 10)) 
				{
					p.setPhoneNumber(telephoneNum);
				}
				
				else if(!telephoneNum.equals(""))
				{
					p.setPhoneNumber(telephoneNum);
				}

				if(!(lastName.length() > 10)) 
				{
					p.setLastName(lastName);
				}
				
				else if(!lastName.equals(""))
				{
					p.setLastName(lastName);
				}

				if(!(address.length() > 30)) 
				{ 
					p.setAddress(address);
				}
				
				else if(!address.equals(""))
				{
					p.setAddress(address);
				}
				
				if(!(firstName.length() > 10)) 
				{
					p.setFirstName(firstName);
				}
				
				else if(!firstName.equals(""))
				{
					p.setFirstName(firstName);
				}

			return true;
			} 
		}  
		return false;
	}

	//This function removes the person from the array
	public boolean removePerson(String personID) 
	{
		for(Contact p:peopleDirectory) 
		{
			if(p.getIdNum().equals(personID)) 
			{ 
				peopleDirectory.remove(p); 
				return true;
			}
		}
		return false;
	}

	//This function adds the person to the array
	public boolean addPerson(Contact person) 
	{ 
		boolean doesPersonExist = false;

		for(Contact p:peopleDirectory) 
		{
			if(p.equals(person)) 
			{
				doesPersonExist = true;
			}
		}
		
		if(!doesPersonExist) 
		{
			peopleDirectory.add(person); 
			return true;
		}
		
		else 
		{
			return false;
		}
	}	
} 

