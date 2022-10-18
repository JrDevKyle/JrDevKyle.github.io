package milestoneThree;

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 
import static org.junit.Assert.assertEquals;

class ContactServiceTest 
{
	// This checks if the person was added correctly
	@Test
	void checkIfPersonAdded() 
	{
		ContactService contactService = new ContactService();
		
		Contact contactServiceOne = new Contact("123","Kyle","Raja","8906647785","6819 Silver Dr.");
		
		assertEquals(true, contactService.addPerson(contactServiceOne));
	}
	
	// This checks if the persons information was updated correctly
	@Test
	void checkIfPersonRefreshInfo() 
	{
		ContactService contactService = new ContactService();
		
		Contact contactServiceOne = new Contact("6654","Doug","Raja","7776647785","68116 Silver Dr.");
		
		Contact contactServiceTwo = new Contact("6642","Mike","Raja","5556647785","68113 Silver Dr.");
		
		Contact contactServiceThree = new Contact("2223","Phil","Raja","1116647785","68114 Silver Dr.");
		
		Contact contactServiceFour = new Contact("3333","Quad","Raja","4446647785","68118 Silver Dr.");
		
		Contact contactServiceFive = new Contact("8888","Sam","Raja","9996647785","68119 Silver Dr.");

		contactService.addPerson(contactServiceOne); 
		
		contactService.addPerson(contactServiceTwo);
		
		contactService.addPerson(contactServiceThree); 
		
		contactService.addPerson(contactServiceFour); 
		
		contactService.addPerson(contactServiceFive);

		assertEquals(true,contactService.refreshPersonInfo("23433", "Angel", "Raja", "2346647785", "681193 Silver Dr."));
		
		assertEquals(false, contactService.refreshPersonInfo("234333", "Bangle", "Raja", "2316647785", "6811934 Silver Dr."));
	}

	// This checks if the persons was deleted correctly
	@Test
	void checkIfPersonDeleted() 
	{
		ContactService contactService = new ContactService();
		Contact contactServiceOne = new Contact("123","Kyle","Raja","8906647785","6819 Silver Dr.");
		
        Contact contactServiceTwo = new Contact("1233","Drew","Raja","7436647785","6811 Silver Dr.");
		
        Contact contactServiceThree = new Contact("12334","Bret","Raja","2436647785","6812 Silver Dr.");
		
        Contact contactServiceFour = new Contact("123344","Fret","Raja","6436647785","6816 Silver Dr.");
		
        Contact contactServiceFive = new Contact("1233445","David","Raja","9436647785","6810 Silver Dr.");

		assertEquals(true, contactService.removePerson("1233")); 
		
		assertEquals(false,contactService.removePerson("435433")); 
		
		assertEquals(false,contactService.removePerson("1233445"));
	}

}

