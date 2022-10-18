package milestoneThree; 

import org.junit.jupiter.api.Assertions; 
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest 
{
	//This checks the length of the telephone number
	@Test
	void checkTelephonePhoneNumberLength() 
	{
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("98521254","Kyle","Raja","8906647785555","6819 Silver Dr.");
		});
	}
	
	//This checks the address length
	@Test
	void checkAddressLength() 
	{
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("98521254","Kyle","Raja","8906647785","6819 Silver Dr.6819 Silver Dr.");
		});
	}
	
	//This checks to see if the last name is null
	@Test
	void checkForLastNameNull() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("98521254","Kyle",null,"8906647785","6819 Silver Dr.");
		});
	}

	
	//This checks to see if the first name is too long
	@Test
	void checkForFirstNameLength() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("985212587","KyleTyleFile","Raja","8906647785","6819 Silver Dr.");
		});
	}


	//This checks the to see if address is null
	@Test
	void checkAddressNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("98521254","Kyle","Raja","8906647785",null);
		});
	}
	
	//This checks to see if the first name is null
	@Test
	void checkForFirstNameNull() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("985212587",null,"Raja","8906647785","6819 Silver Dr.");
		});
	}
	
	//This checks to see if the id is null
	@Test
	void checkForIDNull() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact(null,"Kyle","Raja","8906647785","6819 Silver Dr.");
		});
	}
	
	//This checks to see if the last name is too long
	@Test
	void checkForLastNameLength() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("98521254","Kyle","RajaBajaRaja","8906647785","6819 Silver Dr.");
		});
	}

	//This checks to see if the id is too long in length
	@Test
	void checkForIDLength() 
	{ 
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("985212541235","Kyle","Raja","8906647785","6819 Silver Dr.");
		});
	}

	//This checks telephone number is null
	@Test
	void checkTelephonePhoneNumberNull() 
	{
		Assertions.assertThrows(IllegalArgumentException.class,() ->
		{
			new Contact("98521254","Kyle","Raja",null,"6819 Silver Dr.");
		});
	}
}
	
	
	
	
	
	
	
	
	
	
	
	